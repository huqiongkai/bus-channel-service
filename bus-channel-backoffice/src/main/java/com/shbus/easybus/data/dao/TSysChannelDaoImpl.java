/**
 * 
 */
package com.shbus.easybus.data.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.model.TSysChannelExample;

/**
 * @author Administrator
 *
 */
public class TSysChannelDaoImpl implements TSysChannelMapper {

	private SqlSession sqlSessionTemplate;

	public SqlSession getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<TSysChannel> selectByExample(TSysChannelExample example) {
		return this.sqlSessionTemplate.selectList("com.shbus.easybus.data.model.dao.TSysChannelMapper.selectByExample",
				example);
	}

	@Override
	public TSysChannel selectByPrimaryKey(long channelId) {
		return this.sqlSessionTemplate
				.selectOne("com.shbus.easybus.data.model.dao.TSysChannelMapper.selectByPrimaryKey", channelId);
	}

}
