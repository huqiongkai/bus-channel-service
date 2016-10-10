/**
 * 
 */
package com.w3.fileupload;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author Administrator
 *
 */
public class FileUploadTest {

	public static void main(String[] args) {
//		String targetURL = "http://127.0.0.1:8088/FileUploadDemo/upload";
//		String targetURL = "http://127.0.0.1:8080/imds-web/file/upload";
		String targetURL = "http://101.231.126.155:9080/MNGCC/upload";
		File sourceFile = new File("E:\\tmp\\imds.fritt.com.cn_sha256_cn.zip");

		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(targetURL);

			HttpEntity multipartEntity = MultipartEntityBuilder.create().addTextBody("id", "1234")
//					.addTextBody("sha256", "0d4f43f4a77264e91dab82400958714e063ced3f90b3223010c438865acdd607")
					.addBinaryBody("filename0", sourceFile).build();
			httpPost.setEntity(multipartEntity);

			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
