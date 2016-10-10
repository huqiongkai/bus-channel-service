/**
 * 
 */
package com.shbus.easybus.data.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shbus.easybus.data.model.TInterfaceAccount;
import com.shbus.easybus.data.model.TInterfaceAccountExample;

/**
 * @author Administrator
 *
 */
public class TInterfaceAccountDaoImpl implements TInterfaceAccountMapper {

	private SqlSession sqlSessionTemplate;

	public SqlSession getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<TInterfaceAccount> selectByExample(TInterfaceAccountExample example) {
		return this.sqlSessionTemplate
				.selectList("com.shbus.easybus.data.model.dao.TInterfaceAccountMapper.selectByExample", example);
	}

	@Override
	public TInterfaceAccount selectByPrimaryKey(Long id) {
		return this.sqlSessionTemplate
				.selectOne("com.shbus.easybus.data.model.dao.TInterfaceAccountMapper.selectByPrimaryKey", id);
	}

}
