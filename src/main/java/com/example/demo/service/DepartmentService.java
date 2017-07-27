package com.example.demo.service;

import com.example.demo.domain.Department;

import java.util.List;

/**
 * Created by ll on 2017/7/27.
 */
public interface DepartmentService  {
    public int insertDepartment(Department department);
    public Department selectById(Long id);
}
