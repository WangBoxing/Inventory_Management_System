package com.example.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.entity.Stock;
import com.example.server.mapper.StockMapper;
import com.example.server.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wen Kaiyan
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

    @Resource
    private StockMapper stockMapper;

    @Override
    public Page<Stock> findPage(Page<Stock> page, String name) {
        return stockMapper.findPage(page, name);
    }

    @Transactional
    @Override
    public void setSaleStock(Integer stockId, Integer saleId) {
        stockMapper.deleteSaleStock(stockId, saleId);
        stockMapper.setSaleStock(stockId, saleId);
    }
}
