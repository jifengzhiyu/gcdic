package com.zjy.model.domain;/**
 * @author jifengzhiyu
 * @create 2023-04-27 17:17
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *@ClassName Test
 *@Description TODO
 *@Author kaixin
 *@Date 2023/4/27 17:17
 *@Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_test")
public class Test implements Serializable {
    @TableId
    private Long id;
    @TableField("userId")
    private Integer userId;
    //问题内容
    private String txt;

    public Test(int userId, String txt){
        this.userId = userId;
        this.txt = txt;
    }
}