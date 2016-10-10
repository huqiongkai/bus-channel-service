/**
 * 
 */
package com.shbus.easybus.data.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shbus.easybus.data.model.TSysChinaRegion;
import com.shbus.easybus.data.model.TSysChinaRegionExample;

/**
 * @author Administrator
 *
 */
public class TSysChinaRegionDaoImpl implements TSysChinaRegionMapper {

	private SqlSession sqlSessionTemplate;

	public SqlSession getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<TSysChinaRegion> selectByExample(TSysChinaRegionExample example) {
		return this.sqlSessionTemplate
				.selectList("com.shbus.easybus.data.model.dao.TSysChinaRegionMapper.selectByExample", example);
	}

	@Override
	public TSysChinaRegion selectByPrimaryKey(String regionCode6) {
		return this.sqlSessionTemplate
				.selectOne("com.shbus.easybus.data.model.dao.TSysChinaRegionMapper.selectByPrimaryKey", regionCode6);
	}

	@Override
	public TSysChinaRegion selectByRegionCnname(String regionCnname) {
		return this.sqlSessionTemplate
				.selectOne("com.shbus.easybus.data.model.dao.TSysChinaRegionMapper.selectByRegionCnname", regionCnname);
	}

}
