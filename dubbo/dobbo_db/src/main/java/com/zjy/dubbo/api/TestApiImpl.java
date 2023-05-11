package com.zjy.dubbo.api;/**
 * @author jifengzhiyu
 * @create 2023-04-27 17:25
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.dubbo.mappers.TestMapper;
import com.zjy.model.domain.Test;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@DubboService
public class TestApiImpl implements TestApi {

    @Autowired
    private TestMapper testMapper;

    @Override
    public void add(String str, Integer integer) {
        Test test = new Test(integer,str);
        testMapper.insert(test);
        return;
    }

    @Override
    public String findById(Integer id) {
        Test test = testMapper.selectById(id);

        return test.getTxt();
    }

    @Override
    public List<Test> findLikely(String str) {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("txt","%"+str+"%");
        return testMapper.selectList(queryWrapper);
    }
}
