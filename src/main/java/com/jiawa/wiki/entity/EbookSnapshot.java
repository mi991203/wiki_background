package com.jiawa.wiki.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 电子书快照表
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@TableName("ebook_snapshot")
@Data
public class EbookSnapshot implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 电子书id
     */
    private Long ebookId;

    /**
     * 快照日期
     */
    private LocalDate date;

    /**
     * 阅读数
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer voteCount;

    /**
     * 阅读增长
     */
    private Integer viewIncrease;

    /**
     * 点赞增长
     */
    private Integer voteIncrease;
}
