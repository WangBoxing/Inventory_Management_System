package com.example.server.controller.dto;

import com.example.server.entity.Menu;
import lombok.Data;

import java.util.List;

// 接收前端登录请求的参数
@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
    // 权限
    private String role;
    private List<Menu> menus;
}
