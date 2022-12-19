package com.jiawa.wiki.req;

import lombok.Data;

@Data
public class PageReq<T> {
    private T obj;

    private int page;

    private int size;
}
