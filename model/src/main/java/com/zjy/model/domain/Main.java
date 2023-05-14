package com.zjy.model.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_main")
public class Main extends BasePojo{
    @TableId
    private Long id;
    //原型
    private String word;
    //词性
    private Integer part;
}
