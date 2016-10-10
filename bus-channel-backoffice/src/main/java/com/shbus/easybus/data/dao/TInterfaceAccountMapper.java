package com.shbus.easybus.data.dao;

import java.util.List;

import com.shbus.easybus.data.model.TInterfaceAccount;
import com.shbus.easybus.data.model.TInterfaceAccountExample;

public interface TInterfaceAccountMapper {
	List<TInterfaceAccount> selectByExample(TInterfaceAccountExample example);

	TInterfaceAccount selectByPrimaryKey(Long id);
}