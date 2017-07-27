package com.example.demo.web;

import com.example.demo.domain.Department;
import com.example.demo.service.DepartmentService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ll on 2017/7/27.
 */
@RestController
@RequestMapping("/api")
public class DepartmnetController {
    private final DepartmentService departmentService;
    public DepartmnetController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/insertDepartment")
    public int insertDepartment(@RequestBody Department department){
        System.out.println(department);
        int i  = departmentService.insertDepartment(department);
        return i;
    }

    @GetMapping("/selectDepartmentById")
    @PreAuthorize("hasRole('ADMIN')")
    public Department getDepartmentById(@RequestParam Long id) {
        Department department = departmentService.selectById(id);
        return department;
    }

}
