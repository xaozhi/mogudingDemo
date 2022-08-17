package com.ruoyi.system.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.TWeekly;
import com.ruoyi.system.vo.TWeeklyVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository     // 接口上的注解，告诉spring boot 我这个是一个mapper，操作数据库的接口访问
@InterceptorIgnore(blockAttack = "true", illegalSql = "true")
public interface MGDMapper extends BaseMapper<TWeekly> {

    TWeeklyVO findAll(@Param("typeId")Integer typeId);
}
