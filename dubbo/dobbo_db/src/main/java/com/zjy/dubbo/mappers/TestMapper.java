package com.zjy.dubbo.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjy.model.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
