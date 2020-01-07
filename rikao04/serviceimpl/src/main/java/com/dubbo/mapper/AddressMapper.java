package com.dubbo.mapper;

import com.dubbo.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import tk.mybatis.mapper.common.Mapper;

public interface AddressMapper extends Mapper<Address> {
    @Insert("insert into t_address(name,tel,address,province,city,area) values(#{name},#{tel},#{address},#{city},#{area})")
    void add(Address address);
}