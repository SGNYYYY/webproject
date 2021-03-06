package com.software.controller;

import com.software.beans.HttpResponseEntity;
import com.software.common.Constans;
import com.software.beans.ProdcutResultEntity;
import com.software.service.ProductResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by administrator
 */
@RestController
public class ProductResultController {

    private final Logger logger = LoggerFactory.getLogger(ProductResultController.class);

    @Autowired
    private ProductResultService projectService;


    /**
     * 查询所有分析数据
     * @param
     * @return
     */
    @RequestMapping(value = "/queryProductResultList")
    public HttpResponseEntity queryProjectList() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        List<Map<String,Object>> result = projectService.queryAllProjectName();
        httpResponseEntity.setCode(Constans.SUCCESS_CODE);
        httpResponseEntity.setData(result);
        return httpResponseEntity;
    }

}
