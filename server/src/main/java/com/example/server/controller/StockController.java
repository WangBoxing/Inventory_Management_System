package com.example.server.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.server.common.Result;

import com.example.server.service.IStockService;
import com.example.server.entity.Stock;


import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author Wen Kaiyan
 * @since 2022-10-23
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Resource
    private IStockService stockService;

    @PostMapping
    public Result save(@RequestBody Stock stock) {
        stockService.saveOrUpdate(stock);
        return Result.success();
    }

    @PostMapping("/saleStock/{stockId}/{saleId}")
    public Result saleStock(@PathVariable Integer stockId, @PathVariable Integer saleId) {
        stockService.setSaleStock(stockId, saleId);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        stockService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        stockService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(stockService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(stockService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") String name,
                           @RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
//        QueryWrapper<Stock> queryWrapper =  new QueryWrapper<>();
//        queryWrapper.orderByDesc("id");
//        return Result.success(stockService.page(new Page<>(pageNum, pageSize), queryWrapper));
        Page<Stock> page = stockService.findPage(new Page<>(pageNum, pageSize), name);
        return Result.success(page);
    }
}

