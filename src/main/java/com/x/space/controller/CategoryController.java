package com.x.space.controller;


import com.x.space.entity.Category;
import com.x.space.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Api(tags = "swagger测试", value = "swagger测试")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * mybatisplus实现
     *
     * @return
     */
    @ApiOperation("mybatisplus实现")
    @GetMapping("/list")
    public List<Category> list() {
        List<Category> list = categoryService.list(null);
        return list;
    }

    /**
     * mybatius实现
     */
    @ApiOperation("mybatius实现")
    @GetMapping("/findAll")
    public List<Category> findAll() {
        List<Category> categories = categoryService.findAll();
        return categories;
    }

    @ApiOperation("pagehelper分页")
    @GetMapping("/page")
    public List<Category> page(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        List<Category> page = categoryService.page(pageNum, pageSize);
        return page;
    }
}
