package com.zjy.dubbo.api;/**
 * @author jifengzhiyu
 * @create 2023-04-27 17:25
 */

import com.zjy.dubbo.mappers.TestMapper;
import com.zjy.model.domain.Test;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *@ClassName TestApiImpl
 *@Description TODO
 *@Author kaixin
 *@Date 2023/4/27 17:25
 *@Version 1.0
 */

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
}
