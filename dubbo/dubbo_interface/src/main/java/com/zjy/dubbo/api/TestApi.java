package com.zjy.dubbo.api;

import com.zjy.model.domain.Test;

import java.util.List;

/**
 * @author jifengzhiyu
 * @create 2023-04-27 17:07
 */
public interface TestApi {
    void add(String str,Integer integer);

    String findById(Integer id);

    List<Test> findLikely(String str);
}
