package com.ruoyi.system.dto;

import lombok.Data;

@Data
public class TWeeklyAddDTO {
    /**
     *type=1日报 ,type=2周报 ,type=3月报
     */
    private Integer type;
}
