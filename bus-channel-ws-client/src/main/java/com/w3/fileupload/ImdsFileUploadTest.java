/**
 * 
 */
package com.w3.fileupload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class ImdsFileUploadTest extends TestCase {
	private String targetURL = "http://101.231.126.155:8081/imds-web2/file";
//	targetURL = "http://101.231.126.155:8081/imds-web/file";
	
	/**
	 * @param name
	 */
	public ImdsFileUploadTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testRandomAccessFileLength() throws IOException {
		String srcFile = "E:\\tmp\\filews\\PLSQL Developer9-GGS.zip";
		RandomAccessFile raf = new RandomAccessFile(srcFile, "r");
		System.out.println("file length for RandomAccessFile: " + raf.length());
	}
	
	public void testGenerateSha256() throws FileNotFoundException, IOException {
		String sourceFile = "E:\\dev\\java\\temp\\siflog.txt";
//		sourceFile = "E:\\tmp\\UnlimitedJCEPolicyJDK7.zip";
		sourceFile = "E:\\tmp\\madagascar3.mp4";
		String sha256 = DigestUtils.sha256Hex(new FileInputStream(sourceFile));
		System.out.println(sha256);
		System.out.println(new File(sourceFile).length());
	}
	
	public void testReadRandomAccessFile() throws IOException {
		String sourceFile = "E:\\tmp\\txttest.txt";
		RandomAccessFile raf = new RandomAccessFile(sourceFile, "r");
		raf.seek(3);
		byte[] buf = new byte[4096];
		int len = 4096;
		if (raf.read(buf, 0, len) != -1) {
			System.out.println(new String(buf));
		}
	}
	
	public void testHttpUploadPrepare() throws Exception {
		String srcFile = "E:\\tmp\\imds.fritt.com.cn_sha256_cn.zip";
		String destFile = "E:\\tmp\\logs\\imds-files\\084e1e8c-83c8-4e75-87b9-dd401abaa834\\imds.fritt.com.cn_sha256_cn.zip";
		InputStream input = new BufferedInputStream(new FileInputStream(srcFile));
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[4096];
		int byteCount;
		while ((byteCount = input.read(buf)) > 0) {
			out.write(buf, 0, byteCount);
			if (byteCount > 1000) {
				break;
			}
		}
	}
	
	public void testUploadPrecheck() {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(targetURL
				+ "/upload/precheck?sha256=0d4f43f4a77264e91dab82400958714e063ced3f90b3223010c438865acdd607&file_size=30523");
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			System.out.println(EntityUtils.toString(response.getEntity(), "UTF-8"));
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void testHttpUploadOffset0() {
//		String targetURL = "http://localhost:8080/imds-web/file/upload";
		File sourceFile = new File("E:\\tmp\\imds.fritt.com.cn_sha256_cn.zip");
//		sourceFile = new File("E:\\dev\\java\\temp\\siflog.txt");
//		sourceFile = new File("E:\\tmp\\ios-app\\Icon_512.png");
//		sourceFile = new File("E:\\tmp\\bcprov-jdk15on-153.jar");
//		sourceFile = new File("E:\\tmp\\UnlimitedJCEPolicyJDK7.zip");
//		sourceFile = new File("E:\\tools\\utils\\PLSQL Developer9-GGS.zip");
		sourceFile = new File("E:\\tmp\\madagascar3.mp4");

		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(targetURL + "/upload");

			InputStream stream = new BufferedInputStream(new FileInputStream(sourceFile));
			byte[] bytesBlock = new byte[12288000];	// 12k bytes
			stream.read(bytesBlock);
			stream.close();
			HttpEntity multipartEntity = MultipartEntityBuilder.create()
					.addTextBody("sha256", "9cc60b25a27aea2904d17cc9ca7617173dde6ee95f2ff9ed1457cda7db66c055")
//					.addTextBody("begin_offset", "1241088")
					.addTextBody("file_size", "30199205")
					.addTextBody("file_type", "VIDEO")
//					.addBinaryBody("part_file", bytesBlock, ContentType.DEFAULT_BINARY, "IMG_20160226_121747.jpg")
					.addBinaryBody("filename0", sourceFile).build();
			httpPost.setEntity(multipartEntity);

			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity, "UTF-8"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void testHttpUploadOffsetRange() {
//		String targetURL = "http://localhost:8080/imds-web/file/upload";
		File sourceFile = new File("E:\\tmp\\imds.fritt.com.cn_sha256_cn.zip");
//		sourceFile = new File("E:\\tmp\\spring-petclinic-master.zip");
//		sourceFile = new File("E:\\tmp\\bcprov-jdk15on-153.jar");
//		sourceFile = new File("E:\\dev\\java\\temp\\siflog.txt");
//		sourceFile = new File("E:\\tmp\\UnlimitedJCEPolicyJDK7.zip");
		sourceFile = new File("E:\\tools\\utils\\PLSQL Developer9-GGS.zip");

		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(targetURL + "/upload");

			InputStream stream = new BufferedInputStream(new FileInputStream(sourceFile));
			stream.skip(12288);		// 跳过已上传过的12288字节
//			byte[] bytesBlock = new byte[12288];	// 10k bytes
//			stream.read(bytesBlock);
			HttpEntity multipartEntity = MultipartEntityBuilder.create()
					.addTextBody("sha256", "d4622657902300f762a58b08f94898cfd29cc0fb686b2acd28f03853d6bc4dc4")
					.addTextBody("begin_offset", "12288")
					.addTextBody("file_size", "79260703")
					.addBinaryBody("part_stream", stream, ContentType.DEFAULT_BINARY, "PLSQL Developer9-GGS.zip")
//					.addBinaryBody("part_file", bytesBlock, ContentType.DEFAULT_BINARY, "bcprov-jdk15on-153.jar")
					/*.addBinaryBody("filename0", sourceFile)*/.build();
			httpPost.setEntity(multipartEntity);

			HttpResponse response = httpClient.execute(httpPost);
			stream.close();
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity, "UTF-8"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
