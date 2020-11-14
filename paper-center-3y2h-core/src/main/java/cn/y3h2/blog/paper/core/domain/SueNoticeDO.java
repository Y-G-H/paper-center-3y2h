package cn.y3h2.blog.paper.core.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author     ：yzh
 * @date       ：Created in 2020/11/14 16:44
 * @ClassName  : NoticeDO
 */

@Data
@TableName("sue_notice")
public class SueNoticeDO extends BaseDO{

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 公告类型
     */
    private Integer level;

    /**
     * 发送用户
     */
    private Integer type;

    /**
     * 接收用户
     */
    private Integer to_user;

    /**
     * 公告状态
     */
    private Integer state;
}

