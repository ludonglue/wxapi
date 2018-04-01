package com.example.demo.api.goods.controller.impl;

import com.example.demo.api.goods.controller.ApiGoodsController;
import com.example.demo.api.goods.model.Goods;
import com.example.demo.api.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ludonglue
 * @date 2018/3/29
 */
@RestController
@RequestMapping("/api/goods")
public class ApiGoodsControllerImpl implements ApiGoodsController {

    @Autowired
    private GoodsService goodsService;
    @Override
    public Map<String,Object> getGoodsList(HttpServletRequest request) {
        Map<String,Object> retMap = new HashMap<>();
        List<Goods> list = goodsService.getList();
        retMap.put("list",list);
        return retMap;
    }
}
