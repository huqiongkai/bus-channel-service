package com.shbus.easybus.data.dao;

import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.model.TSysChannelExample;
import java.util.List;

public interface TSysChannelMapper {
	List<TSysChannel> selectByExample(TSysChannelExample example);

	TSysChannel selectByPrimaryKey(long channelId);
}