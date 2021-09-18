package com.x.space.controller;


import com.x.space.entity.Category;
import com.x.space.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品分类 前端控制器
 * </p>
 *
 * @author GCX
 * @since 2021-08-31
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * mybatisplus实现
     * @return
     */
    @GetMapping("/list")
    public List<Category> list(){
        List<Category> list = categoryService.list(null);
        return list;
    }

    /**
     * mybatius实现
     */
    @GetMapping("/findAll")
    public List<Category> findAll(){
        List<Category> categories = categoryService.findAll();
        return categories;
    }
}
