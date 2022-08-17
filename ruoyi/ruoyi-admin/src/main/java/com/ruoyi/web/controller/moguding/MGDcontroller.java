package com.ruoyi.web.controller.moguding;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.service.MGDService;
import com.ruoyi.system.vo.TWeeklyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/moguding")
@Api(tags = "蘑菇钉")
public class MGDcontroller extends BaseController {

    @Autowired
    MGDService mgdService;


//    @ResponseBody
    @GetMapping("/findAll")
    @ApiOperation(value = "查询")
    public TWeeklyVO findAll(@ApiParam(value = "试题类型1日报2周报")@RequestBody Integer typeId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        return mgdService.findAll(typeId);

    }
}

