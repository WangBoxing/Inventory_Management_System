package com.example.server.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.entity.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Wen Kaiyan
 * @since 2022-10-23
 */
public interface StockMapper extends BaseMapper<Stock> {
    Page<Stock> findPage(Page<Stock> page, @Param("name") String name);

    void deleteSaleStock(@Param("stockId") Integer stockId, @Param("saleId") Integer saleId);

    void setSaleStock(@Param("stockId") Integer stockId, @Param("saleId") Integer saleId);
}
