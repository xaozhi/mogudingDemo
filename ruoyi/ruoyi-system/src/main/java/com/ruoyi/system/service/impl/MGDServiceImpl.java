package com.ruoyi.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.system.domain.TWeekly;
import com.ruoyi.system.dto.TWeeklyAddDTO;
import com.ruoyi.system.mapper.MGDMapper;
import com.ruoyi.system.service.MGDService;
import com.ruoyi.system.vo.TWeeklyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MGDServiceImpl extends ServiceImpl<MGDMapper, TWeekly> implements MGDService {

    @Autowired
    MGDMapper mgdMapper;

    @Override
    public TWeeklyVO findAll(Integer typeId) {
       return mgdMapper.findAll(typeId);
    }
}
