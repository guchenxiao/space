package com.x.space.mapper;

import com.x.space.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 商品分类 Mapper 接口
 * </p>
 *
 * @author GCX
 * @since 2021-08-31
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> findAll();

}
