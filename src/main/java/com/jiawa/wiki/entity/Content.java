package com.jiawa.wiki.entity;

import java.io.Serializable;

/**
 * <p>
 * 文档内容
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content{" +
            "id=" + id +
            ", content=" + content +
        "}";
    }
}
