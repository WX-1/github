package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.pojo.Address;
import com.dubbo.service.AddressService;
import com.dubbo.util.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Reference
    private AddressService addressService;

    @RequestMapping("/add")
    public Result add(@RequestBody Address address){
        try {
            addressService.add(address);
            return new Result("添加成功",true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Result("添加失败",false);
    }
}
