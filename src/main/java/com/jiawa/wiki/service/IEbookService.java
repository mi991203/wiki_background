package com.jiawa.wiki.service;

import com.jiawa.wiki.entity.Ebook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.req.PageReq;
import com.jiawa.wiki.resp.EbookQueryResp;
import com.jiawa.wiki.resp.PageResp;

/**
 * <p>
 * 电子书 服务类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
public interface IEbookService extends IService<Ebook> {

    PageResp<EbookQueryResp> list(PageReq<EbookQueryReq> req);
}
