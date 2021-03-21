package cn.y3h2.blog.paper.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：yzh
 * @date ：Created in 2020/11/14 16:44
 * @ClassName : 公告Dto
 */

@Data
public class SueNoticeDTO implements Serializable {

    private static final long serialVersionUID = 1407201752359618325L;

    /**
     * 公告id
     */
    private Long id;

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
    private Long fromUser;

    /**
     * 接收用户
     */
    private Long toUser;

    /**
     * 公告状态
     * @see cn.y3h2.blog.paper.common.enums.NoticeStateEnums
     */
    private Integer state;
}
