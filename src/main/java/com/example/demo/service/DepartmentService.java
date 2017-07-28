package com.example.demo.service;

import com.example.demo.domain.Department;
import com.example.demo.domain.User;

import java.util.List;

/**
 * Created by ll on 2017/7/27.
 */
public interface DepartmentService  {
    int insertDepartment(Department department);
    Department selectById(Long id);
    List<Department> seachDepartment(int page,int pageSize);

}
