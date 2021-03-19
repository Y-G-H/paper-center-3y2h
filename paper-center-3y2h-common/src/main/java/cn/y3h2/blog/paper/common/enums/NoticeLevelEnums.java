package cn.y3h2.blog.paper.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName BaseDO
 * @Author kongming
 * @Date 2020/11/11 10:18 下午
 * @Description 公告等级枚举
 */
@AllArgsConstructor
public enum NoticeLevelEnums {
    NORMAL(0, "normal", "普通"),
    IMPORTANT(1, "important", "重要"),
    VERY_IMPORTANT(2, "very_important", "非常重要重要");

    @Getter
    private Integer code;

    @Getter
    private String value;

    @Getter
    private String msg;

}
