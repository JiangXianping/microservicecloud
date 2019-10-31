package com.jiang.service;

import com.jiang.model.Dept;
import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(long id);
    List<Dept> list();
}
