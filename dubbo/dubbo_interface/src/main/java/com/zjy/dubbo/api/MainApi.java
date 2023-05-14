package com.zjy.dubbo.api;

import com.zjy.model.domain.Main;

import java.util.List;

public interface MainApi {
    //用户 查询单词
    List<Main> findWords(String str);
}
