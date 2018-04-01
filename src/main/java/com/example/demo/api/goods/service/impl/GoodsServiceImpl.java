package com.example.demo.api.goods.service.impl;

import com.example.demo.api.goods.dao.GoodsDao;
import com.example.demo.api.goods.model.Goods;
import com.example.demo.api.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ludonglue
 * @date 2018/3/30
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<Goods> getList() {
        return goodsDao.getList();
    }
}
