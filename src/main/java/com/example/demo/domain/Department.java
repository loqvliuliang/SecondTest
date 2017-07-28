package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.demo.security.AuthenticationMethod;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * Created by ll on 2017/7/27.
 */
@Data
@TableName("alt_department")
public class Department {
    @TableId
    private Long id;
    private String name;
    private String code;
    private int status;
    private ZonedDateTime createDate;
    private AuthenticationMethod authenticationMethod;
}
