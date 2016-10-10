/**
 * 
 */
package com.shbus.easybus.data.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TExBusOrderExample;

/**
 * @author Administrator
 *
 */
public class TExBusOrderDaoImpl implements TExBusOrderMapper {

	private SqlSession sqlSessionTemplate;

	public SqlSession getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int countByExample(TExBusOrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long insert(TExBusOrder record) {
		this.sqlSessionTemplate.insert("com.shbus.easybus.data.model.dao.TExBusOrderMapper.insert", record);
		return record.getId();
	}

	@Override
	public List<TExBusOrder> selectByExample(TExBusOrderExample example) {
		return this.sqlSessionTemplate.selectList("com.shbus.easybus.data.model.dao.TExBusOrderMapper.selectByExample",
				example);
	}

	@Override
	public TExBusOrder selectByPrimaryKey(Long id) {
		return this.sqlSessionTemplate
				.selectOne("com.shbus.easybus.data.model.dao.TExBusOrderMapper.selectByPrimaryKey", id);
	}

	@Override
	public int updateByExample(TExBusOrder record, TExBusOrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TExBusOrder record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleSelective(TExBusOrder record, TExBusOrderExample example) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("record", record);
		paramMap.put("example", example);
		return this.sqlSessionTemplate
				.update("com.shbus.easybus.data.model.dao.TExBusOrderMapper.updateByExampleSelective", paramMap);
	}

	@Override
	public List<String> selectSandSuccOrderList(String supplierId, String ticketStatus, String ticketRecStatus,
			String ticketRefundStatus) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("supplierId", supplierId);
		paramMap.put("ticketStatus", ticketStatus);
		paramMap.put("ticketRecStatus", ticketRecStatus);
		paramMap.put("ticketRefundStatus", ticketRefundStatus);
		return this.sqlSessionTemplate
				.selectList("com.shbus.easybus.data.model.dao.TExBusOrderMapper.selectSandSuccOrderList", paramMap);
	}

	@Override
	public List<String> selectSandAppOrderList(String supplierId, String ticketStatus) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("supplierId", supplierId);
		paramMap.put("ticketStatus", ticketStatus);
		return this.sqlSessionTemplate
				.selectList("com.shbus.easybus.data.model.dao.TExBusOrderMapper.selectSandAppOrderList", paramMap);
	}

}
