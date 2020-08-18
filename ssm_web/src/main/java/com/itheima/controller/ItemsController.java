package com.itheima.controller;

import com.itheima.entry.Result;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuzhang
 * @version 1.0
 * @date 2020/8/17/0017 11:04
 */
@RestController
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findAll")
    public List<Items> findAll() {
        List<Items> itemsList = itemsService.findAll();
        return itemsList;
    }
}
