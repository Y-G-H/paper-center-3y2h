package cn.y3h2.blog.paper.provider.service;

import cn.y3h2.blog.paper.api.SueNoticeFacade;
import cn.y3h2.blog.paper.api.domian.FindNoticeCondition;
import cn.y3h2.blog.paper.common.dto.SueNoticeDTO;
import cn.y3h2.blog.paper.common.model.Response;
import cn.y3h2.blog.paper.provider.helper.ConverterHelper;
import cn.y3h2.blog.paper.core.domain.SueNoticeDO;
import cn.y3h2.blog.paper.core.manager.SueNoticeManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：yzh
 * @date ：Created in 2020/11/14 17:29
 * @ClassName : SueNoticeService
 * @Description : 公告列表Service实现
 */

@Service
@Slf4j
public class SueNoticeService implements SueNoticeFacade {

    @Autowired
    private SueNoticeManager sueNoticeManager;

    @Override
    public Response<List<SueNoticeDTO>> findSueNotice(FindNoticeCondition condition) {
        List<SueNoticeDO> notices = sueNoticeManager.findNotice(condition);
        List<SueNoticeDTO> sueNoticeDtos = notices.stream().map(ConverterHelper::toSueNoticeDTO).collect(Collectors.toList());
        return Response.ok(sueNoticeDtos);
    }
}
