package com.jiawa.wiki.req;

import lombok.Data;

@Data
public class EbookQueryReq {
    private Long id;

    private String name;

    private Long categoryId2;
}
