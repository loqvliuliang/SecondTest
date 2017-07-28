package com.example.demo.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.domain.Department;
import com.example.demo.domain.User;
import com.example.demo.persistence.DepartmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ll on 2017/7/27.
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper,Department> implements DepartmentService {
    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public int insertDepartment(Department department){
        return departmentMapper.insert(department);
    }

    @Override
    public Department selectById(Long id) {
        Department department = departmentMapper.selectById(id);
        return department;
    }

    @Override
    public List<Department> seachDepartment(int page, int pageSize) {
        List<Department> list = departmentMapper.selectPage(new Page<Department>(page,pageSize),new EntityWrapper<>());
        return list;
    }



}
