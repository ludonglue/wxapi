package com.example.demo.api.goods.dao;

import com.example.demo.api.goods.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ludonglue
 * @date 2018/3/30
 */
@Repository
public interface GoodsDao {
    List<Goods> getList();
}
