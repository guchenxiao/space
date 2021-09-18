package com.x.space.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x.space.entity.Category;

import java.util.List;

/**
 * <p>
 * 商品分类 服务类
 * </p>
 *
 * @author GCX
 * @since 2021-08-31
 */
public interface CategoryService extends IService<Category> {

    List<Category> findAll();

}
