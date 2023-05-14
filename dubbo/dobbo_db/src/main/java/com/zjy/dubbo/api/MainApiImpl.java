package com.zjy.dubbo.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.dubbo.mappers.MainMapper;
import com.zjy.model.domain.Main;
import com.zjy.model.domain.Test;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class MainApiImpl implements MainApi{

    @Autowired
    private MainMapper mainMapper;

    @Override
    public List<Main> findWords(String str) {
        QueryWrapper<Main> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("word","%"+str+"%");
        return mainMapper.selectList(queryWrapper);
    }
}
