package com.example.demo.security;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.persistence.RoleMapper;
import com.example.demo.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ll on 2017/8/2.
 */
@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    private CustomUserService customUserService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public MyUserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.selectByName(s);
        List<Role> roles = null;
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        try {
            roles = roleMapper.getRolesByUser(user.getId());
            System.out.println("用户角色toString : " + roles.toString());
        }catch (Exception e){
            throw new UsernameNotFoundException("查询role失败！");
        }

        return new MyUserDetails(user,roles);
    }
}