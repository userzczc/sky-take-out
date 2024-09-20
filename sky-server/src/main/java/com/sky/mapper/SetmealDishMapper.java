package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据id查询对应的套餐id
     * @param dishIds
     * @return
     */

    List<Long> getByDishId(List<Long> dishIds);
}
