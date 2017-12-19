package com.travel.controller;

import com.alibaba.fastjson.JSON;
import com.travel.dao.AttractionInfoDao;
import com.travel.entity.AttractionInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author:4mermory
 * @Description:景点信息controller method Instance
 * @Date:created in  2017-12-2017/12/18  16:34
 * @Modified By:
 */
@Controller
public class AttractionInfoController {

    @Autowired
    private AttractionInfoDao attractionInfoDao;

    @RequestMapping("selectOneUser")
    public String selectOneUMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String attr_id = request.getParameter("attr_id");
        AttractionInfoEntity attractionInfoEntity = attractionInfoDao.queryOne(Integer.parseInt(attr_id));
        response.getWriter().write(JSON.toJSONString(attractionInfoEntity));
        return  "index";
    }

    @RequestMapping("quesyAll")
    public void selectAllUMethod( HttpServletResponse response) throws IOException {
        System.out.println("sssss");
        List<AttractionInfoEntity> list = attractionInfoDao.queryAll();
        for (AttractionInfoEntity attractionInfoEntity : list) {
            System.out.println(attractionInfoEntity);
        }
        response.setCharacterEncoding("GBK");
        response.getWriter().write(JSON.toJSONString(list));
    }












}
