package cn.y3h2.blog.paper.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：yzh
 * @date ：Created in 2020/11/14 16:44
 * @ClassName : 公告Dto
 */

@Data
public class SueNoticeDto implements Serializable {

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
