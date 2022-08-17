package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TWrite {
    /**
     *主键id
     */
    private Integer id;
    /**
     *关联id
     */
    private Integer uid;
    /**
     *type=1日报 ,type=2周报 ,type=3月报
     */
    private Integer type;
    /**
     *周报日报内容
     */
    private String write;
}
