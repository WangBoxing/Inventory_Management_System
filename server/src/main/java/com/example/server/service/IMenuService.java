package com.example.server.service;

import com.example.server.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wen Kaiyan
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);
}
