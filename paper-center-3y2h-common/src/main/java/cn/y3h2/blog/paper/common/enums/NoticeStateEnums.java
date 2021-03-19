package cn.y3h2.blog.paper.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName BaseDO
 * @Author kongming
 * @Date 2020/11/11 10:18 下午
 * @Description 公告状态枚举
 */
@AllArgsConstructor
public enum NoticeStateEnums {
    UNREAD(0, "unread", "未读"),
    READ(1, "read", "已读");

    @Getter
    private Integer code;

    @Getter
    private String value;

    @Getter
    private String msg;

}
