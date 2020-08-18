package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author yuzhang
 * @version 1.0
 * @date 2020/8/16/0016 19:59
 */
public interface ItemsDao {
    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}

