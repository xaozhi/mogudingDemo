package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
@Data
public class TWeekly {

    /**
     * 主键id
     */
    private Integer id;
    /**
     *上传用户名
     */
    private String user;
    /**
     *挂时长天数
     */
    private Integer day;
    /**
     *type=1日报 ,type=2周报 ,type=3月报
     */
    private Integer type;
    /**
     *上传时间
     */
    private Date startTime;
    /**
     *修改时间
     */
    private Date endTime;
}
