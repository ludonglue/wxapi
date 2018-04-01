package com.example.demo.api.goods.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ludonglue
 * @date 2018/3/29
 */
public interface ApiGoodsController {
    /**
     *   获取商品列表
     */
    @RequestMapping("/list")
    Map<String,Object> getGoodsList(HttpServletRequest request);
}
