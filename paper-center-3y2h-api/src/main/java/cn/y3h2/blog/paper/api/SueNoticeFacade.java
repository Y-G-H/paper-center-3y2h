package cn.y3h2.blog.paper.api;

import cn.y3h2.blog.paper.api.domian.FindNoticeCondition;
import cn.y3h2.blog.paper.common.dto.SueNoticeDto;
import cn.y3h2.blog.paper.common.model.Response;

import java.util.List;

/**
 * @author ：yzh
 * @date ：Created in 2020/11/14 17:30
 * @ClassName : SueNoticeFacade
 */

public interface SueNoticeFacade {

    /**
     * 查询公告列表
     * @param condition 查询条件
     * @return
     */
    Response<List<SueNoticeDto>> findSueNotice(FindNoticeCondition condition);
}
