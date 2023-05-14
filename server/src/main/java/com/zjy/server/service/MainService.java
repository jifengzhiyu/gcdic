package com.zjy.server.service;

import com.zjy.dubbo.api.MainApi;
import com.zjy.model.domain.Main;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MainService {
    @DubboReference
    private MainApi mainApi;

    //用户 查询单词
    public List<Main> findWords(String str){

        return mainApi.findWords(str);

    }
}
