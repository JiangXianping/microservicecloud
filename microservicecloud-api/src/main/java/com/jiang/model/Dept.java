package com.jiang.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private long deptno;        //主键
    private String dname;       //部门名称
    private String db_source;   //来自哪个数据库，因为为服务架构可以一个服务对应一个数据，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}