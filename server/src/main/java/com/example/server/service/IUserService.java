package com.example.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.controller.dto.UserDTO;
import com.example.server.controller.dto.UserPasswordDTO;
import com.example.server.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wen Kaiyan
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);

    Page<User> findPage(Page<User> page, String username, String email, String address);
}
