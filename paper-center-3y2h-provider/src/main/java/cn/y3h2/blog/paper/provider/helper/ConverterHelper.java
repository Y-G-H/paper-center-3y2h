package cn.y3h2.blog.paper.provider.helper;

import cn.y3h2.blog.paper.common.dto.SueNoticeDTO;
import cn.y3h2.blog.paper.core.domain.SueNoticeDO;

/**
 * @ClassName ConverterHelper
 * @Author yzh
 * @Date 2020/11/14 17:49 下午
 * @Description 类型转换器
 */
public class ConverterHelper {

    public static SueNoticeDTO toSueNoticeDTO(SueNoticeDO sueNoticeDO) {
        SueNoticeDTO sueNoticeDto = new SueNoticeDTO();
        sueNoticeDto.setId(sueNoticeDO.getId());
        sueNoticeDto.setTitle(sueNoticeDO.getTitle());
        sueNoticeDto.setContent(sueNoticeDO.getContent());
        sueNoticeDto.setLevel(sueNoticeDO.getLevel());
        sueNoticeDto.setFromUser(sueNoticeDO.getFromUser());
        sueNoticeDto.setToUser(sueNoticeDO.getToUser());
        sueNoticeDto.setState(sueNoticeDO.getState());
        return sueNoticeDto;
    }


}
