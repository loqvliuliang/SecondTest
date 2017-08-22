package com.example.demo.persistence;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by ll on 2017/8/3.
 */
@Mapper
public interface RoleMapper {
    List<Role> getRolesByUser(Long userId);
}
