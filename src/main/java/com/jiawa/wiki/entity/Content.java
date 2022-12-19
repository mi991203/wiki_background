package com.jiawa.wiki.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 文档内容
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Data
@TableName("content")
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文档id
     */
    private Long id;

    /**
     * 内容
     */
    private String content;
}
