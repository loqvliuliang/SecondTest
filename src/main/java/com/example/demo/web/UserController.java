package com.example.demo.web;

import com.example.demo.domain.Department;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ll on 2017/7/28.
 */
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    //根据userId得到部门信息
    @GetMapping("/findDepartmnetByUserId/{userId}")
    public Department findDepartmentByUserId(@PathVariable Long userId){
        Department department = userService.findDepartmentByUserId(userId);
        return department;
    }

    //根据部门ID得到此部门下的所有员工
    @GetMapping("/findUsersByDepartmentId/{departmentId}")
    public List<User> findUsersByDepartmentId(@PathVariable Long departmentId){
        List<User> list = userService.findUsersByDepartmentId(departmentId);
        return list;
    }


}
