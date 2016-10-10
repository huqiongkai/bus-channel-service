package com.shbus.easybus.data.dao;

import com.shbus.easybus.data.model.TSysChinaRegion;
import com.shbus.easybus.data.model.TSysChinaRegionExample;
import java.util.List;

public interface TSysChinaRegionMapper {
    List<TSysChinaRegion> selectByExample(TSysChinaRegionExample example);

    TSysChinaRegion selectByPrimaryKey(String regionCode6);
    
    TSysChinaRegion selectByRegionCnname(String regionCnname);
}