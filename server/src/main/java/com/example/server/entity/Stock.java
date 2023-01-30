package com.example.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Wen Kaiyan
 * @since 2022-10-23
 */
@Getter
@Setter
@ApiModel(value = "Stock对象", description = "")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("货品名称")
      private String name;

      @ApiModelProperty("单价")
      private Integer price;

      @ApiModelProperty("数量")
      private Integer count;

      // 日期格式化
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
      @ApiModelProperty("入库时间")
      private Date createTime;

      @ApiModelProperty("负责人id")
      private Integer adminId;

      @TableField(exist = false)
      private String admin;
}
