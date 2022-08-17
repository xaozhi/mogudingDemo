package com.ruoyi.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.TWeekly;
import com.ruoyi.system.vo.TWeeklyVO;

import java.util.List;

public interface MGDService extends IService<TWeekly> {

    TWeeklyVO findAll(Integer typeId);
}
