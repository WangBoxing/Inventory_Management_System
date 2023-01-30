package com.example.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.entity.Stock;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wen Kaiyan
 */
public interface IStockService extends IService<Stock> {

    Page<Stock> findPage(Page<Stock> page, String name);

    void setSaleStock(Integer stockId, Integer saleId);
}
