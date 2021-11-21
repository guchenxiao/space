package com.x.space.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.x.space.entity.Category;
import com.x.space.mapper.CategoryMapper;
import com.x.space.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品分类 服务实现类
 * </p>
 *
 * @author GCX
 * @since 2021-08-31
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        List<Category> categories = categoryMapper.findAll();
        return categories;
    }

    public List<Category> page(int pageNum,int pageSize) {
        //使用分页插件
        PageHelper.offsetPage(pageNum, pageSize);
        //查询数据
        QueryWrapper<Category> queryWrapper = new QueryWrapper<>();
        List<Category> categoryList = categoryMapper.selectList(null);
        return categoryList;
    }

}
