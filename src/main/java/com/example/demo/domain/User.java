package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
@Data
@TableName("alt_user")
public class User {
    @TableId
    private Long id;
    private Long departmentId;
    private String username;
    private String password;
    private String fullName;
}
