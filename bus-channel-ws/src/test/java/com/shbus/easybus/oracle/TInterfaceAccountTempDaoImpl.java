/**
 * 
 */
package com.shbus.easybus.oracle;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 * @author Administrator
 *
 */
public class TInterfaceAccountTempDaoImpl implements TInterfaceAccountTempMapper {
	private SqlSession sqlSessionTemplate;

	public SqlSession getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int countByExample(TInterfaceAccountTempExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(TInterfaceAccountTempExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long insert(TInterfaceAccountTemp record) {
		// TODO Auto-generated method stub
		int rows = this.sqlSessionTemplate.insert("com.shbus.easybus.oracle.TInterfaceAccountTempMapper.insert", record);
		System.out.println("rows=" + rows);
		return record.getId();
	}

	@Override
	public int insertSelective(TInterfaceAccountTemp record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TInterfaceAccountTemp> selectByExample(TInterfaceAccountTempExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(TInterfaceAccountTemp record, TInterfaceAccountTempExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(TInterfaceAccountTemp record, TInterfaceAccountTempExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
