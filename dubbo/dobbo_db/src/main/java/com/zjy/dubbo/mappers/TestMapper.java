package com.zjy.dubbo.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjy.model.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Mapperzhiyu
 * @create 2023-04-27 17:28
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
