package com.shbus.easybus.oracle;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterfaceAccountTempMapper {
    int countByExample(TInterfaceAccountTempExample example);

    int deleteByExample(TInterfaceAccountTempExample example);

    long insert(TInterfaceAccountTemp record);

    int insertSelective(TInterfaceAccountTemp record);

    List<TInterfaceAccountTemp> selectByExample(TInterfaceAccountTempExample example);

    int updateByExampleSelective(@Param("record") TInterfaceAccountTemp record, @Param("example") TInterfaceAccountTempExample example);

    int updateByExample(@Param("record") TInterfaceAccountTemp record, @Param("example") TInterfaceAccountTempExample example);
}