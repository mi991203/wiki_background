package com.jiawa.wiki.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 电子书
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Data
@TableName("ebook")
public class Ebook implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 分类1
     */
    private Long category1Id;

    /**
     * 分类2
     */
    private Long category2Id;

    /**
     * 描述
     */
    private String description;

    /**
     * 封面
     */
    private String cover;

    /**
     * 文档数
     */
    private Integer docCount;

    /**
     * 阅读数
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer voteCount;
}
