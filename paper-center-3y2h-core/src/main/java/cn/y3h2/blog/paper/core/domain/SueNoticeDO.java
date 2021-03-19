package cn.y3h2.blog.paper.core.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
     * @see cn.y3h2.blog.paper.common.enums.NoticeLevelEnums
     */
    private Integer level;

    /**
     * 发送用户
     */
    @TableField("from_user")
    private Long fromUser;

    /**
     * 接收用户
     */
    @TableField("to_user")
    private Long toUser;

    /**
     * 公告状态
     * @see cn.y3h2.blog.paper.common.enums.NoticeStateEnums
     */
    private Integer state;
}

