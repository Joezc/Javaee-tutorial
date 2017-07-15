package com.xzgl.www.college.dao;

import com.xzgl.www.entity.Dept;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-10.
 */
public interface DeptDao {
    public List<Dept> findAll();

    public void add(String deptName);

    public String findIdByName(String deptName);

    public void update(Dept dept);

    public void delete(int deptId);

    public List<String> findAllDeptName();

}
