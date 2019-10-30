package com.jiang.controller;

import com.jiang.model.Dept;
import com.jiang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @ResponseBody
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id) {
        return deptService.get(id);
    }

    @ResponseBody
    @RequestMapping(value="/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

}