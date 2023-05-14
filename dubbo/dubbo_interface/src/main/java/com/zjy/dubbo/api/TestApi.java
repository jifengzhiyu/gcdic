package com.zjy.dubbo.api;

import com.zjy.model.domain.Test;

import java.util.List;


public interface TestApi {
    void add(String str,Integer integer);

    String findById(Integer id);

    List<Test> findLikely(String str);
}
