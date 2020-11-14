package cn.y3h2.blog.paper.core.manager;

import cn.y3h2.blog.paper.api.domian.FindNoticeCondition;
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

    public List<SueNoticeDO> findNotice(FindNoticeCondition condition) {
        try{
            LambdaQueryWrapper<SueNoticeDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            if (Objects.nonNull(condition.getId())) lambdaQueryWrapper.eq(SueNoticeDO::getId, condition.getId());
            if (Objects.nonNull(condition.getTitle())) lambdaQueryWrapper.eq(SueNoticeDO::getTitle, condition.getTitle());
            if (Objects.nonNull(condition.getContent())) lambdaQueryWrapper.eq(SueNoticeDO::getContent, condition.getContent());
            if (Objects.nonNull(condition.getLevel())) lambdaQueryWrapper.eq(SueNoticeDO::getLevel, condition.getLevel());
            if (Objects.nonNull(condition.getType())) lambdaQueryWrapper.eq(SueNoticeDO::getType, condition.getType());
            if (Objects.nonNull(condition.getTo_user())) lambdaQueryWrapper.eq(SueNoticeDO::getTo_user, condition.getTo_user());
            if (Objects.nonNull(condition.getState())) lambdaQueryWrapper.eq(SueNoticeDO::getState, condition.getState());

            List<SueNoticeDO> sueNoticeDOS = sueNoticeMapper.selectList(lambdaQueryWrapper);
            return sueNoticeDOS;
        }catch (Exception ex) {
            throw ExceptionFactory.getSqlException(MessageEnums.SQL_ERROR, "查询公告列表错误");
        }
    }
}
