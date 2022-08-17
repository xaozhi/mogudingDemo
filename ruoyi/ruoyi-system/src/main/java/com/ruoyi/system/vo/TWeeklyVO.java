package com.ruoyi.system.vo;

import lombok.Data;

@Data
public class TWeeklyVO {
    /**
     *type=1日报 ,type=2周报 ,type=3月报
     */
    private Integer type;
    /**
     *周报日报内容
     */
    private String write;
}
