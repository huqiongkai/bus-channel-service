package com.shbus.easybus.data.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TExBusOrderExample;

public interface TExBusOrderMapper {
	int countByExample(TExBusOrderExample example);

	Long insert(TExBusOrder record);

	List<TExBusOrder> selectByExample(TExBusOrderExample example);

	TExBusOrder selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") TExBusOrder record, @Param("example") TExBusOrderExample example);

	int updateByExample(@Param("record") TExBusOrder record, @Param("example") TExBusOrderExample example);

	int updateByPrimaryKey(TExBusOrder record);

	List<String> selectSandSuccOrderList(String supplierId, String ticketStatus, String ticketRecStatus,
			String ticketRefundStatus);

	List<String> selectSandAppOrderList(String supplierId, String ticketStatus);
}