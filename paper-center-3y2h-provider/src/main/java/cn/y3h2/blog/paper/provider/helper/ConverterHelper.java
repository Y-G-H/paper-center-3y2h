package cn.y3h2.blog.paper.provider.helper;

import cn.y3h2.blog.paper.common.dto.SueNoticeDto;
import cn.y3h2.blog.paper.core.domain.SueNoticeDO;

/**
 * @ClassName ConverterHelper
 * @Author yzh
 * @Date 2020/11/14 17:49 下午
 * @Description 类型转换器
 */
public class ConverterHelper {

    public static SueNoticeDto toSueNoticeDTO(SueNoticeDO sueNoticeDO) {
        SueNoticeDto sueNoticeDto = new SueNoticeDto();
        sueNoticeDto.setId(sueNoticeDO.getId());
        sueNoticeDto.setTitle(sueNoticeDO.getTitle());
        sueNoticeDto.setContent(sueNoticeDO.getContent());
        sueNoticeDto.setLevel(sueNoticeDO.getLevel());
        sueNoticeDto.setType(sueNoticeDO.getType());
        sueNoticeDto.setTo_user(sueNoticeDO.getTo_user());
        sueNoticeDto.setState(sueNoticeDO.getState());
        return sueNoticeDto;
    }


}
