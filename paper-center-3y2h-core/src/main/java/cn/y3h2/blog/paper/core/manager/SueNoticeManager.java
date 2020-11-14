package cn.y3h2.blog.paper.core.manager;

import cn.y3h2.blog.paper.api.domian.FindNoticeCoding;
import cn.y3h2.blog.paper.common.enums.MessageEnums;
import cn.y3h2.blog.paper.common.excaption.ExceptionFactory;
import cn.y3h2.blog.paper.core.domain.SueNoticeDO;
import cn.y3h2.blog.paper.core.dao.SueNoticeMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @author ：yzh
 * @date ：Created in 2020/11/14 16:57
 * @ClassName : NoticeManager
 */

@Component
public class SueNoticeManager {

    @Autowired
    private SueNoticeMapper sueNoticeMapper;

    public List<SueNoticeDO> findNotice(FindNoticeCoding coding) {
        try{
            LambdaQueryWrapper<SueNoticeDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            if (Objects.nonNull(coding.getId())) lambdaQueryWrapper.eq(SueNoticeDO::getId, coding.getId());
            if (Objects.nonNull(coding.getTitle())) lambdaQueryWrapper.eq(SueNoticeDO::getTitle, coding.getTitle());
            if (Objects.nonNull(coding.getContent())) lambdaQueryWrapper.eq(SueNoticeDO::getContent, coding.getContent());
            if (Objects.nonNull(coding.getLevel())) lambdaQueryWrapper.eq(SueNoticeDO::getLevel, coding.getLevel());
            if (Objects.nonNull(coding.getType())) lambdaQueryWrapper.eq(SueNoticeDO::getType, coding.getType());
            if (Objects.nonNull(coding.getTo_user())) lambdaQueryWrapper.eq(SueNoticeDO::getTo_user, coding.getTo_user());
            if (Objects.nonNull(coding.getState())) lambdaQueryWrapper.eq(SueNoticeDO::getState, coding.getState());

            List<SueNoticeDO> sueNoticeDOS = sueNoticeMapper.selectList(lambdaQueryWrapper);
            return sueNoticeDOS;
        }catch (Exception ex) {
            throw ExceptionFactory.getSqlException(MessageEnums.SQL_ERROR, "查询公告列表错误");
        }
    }
}
