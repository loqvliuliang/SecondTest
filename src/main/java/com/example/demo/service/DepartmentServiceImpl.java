package com.example.demo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.domain.Department;
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

}
