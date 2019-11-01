package com.jiang.controller;

import com.jiang.deptInterface.DeptClientService;
import com.jiang.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Feign {

    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return this.deptClientService.get(id);
    }

    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.deptClientService.add(dept);
    }

}