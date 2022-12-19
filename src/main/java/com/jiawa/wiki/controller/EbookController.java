package com.jiawa.wiki.controller;

import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.req.PageReq;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.resp.EbookQueryResp;
import com.jiawa.wiki.resp.PageResp;
import com.jiawa.wiki.service.IEbookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 电子书 前端控制器
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private IEbookService ebookService;

    @PostMapping("/list")
    public CommonResp<PageResp<EbookQueryResp>> list(@RequestBody PageReq<EbookQueryReq> req) {
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

}
