package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@TableName("alt_user")
public class User  implements UserDetails {
    @TableId
    private Long id;
    private Long departmentId;
    private String username;
    private String password;
    private String role;

    public User(){

    }

    public User(User user) {
        this.id = user.getId();
        this.departmentId = user.getDepartmentId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRole();
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
