package com.shier.shiercommon.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 接口枚举
 * @author shier
 *
 */
public enum UserInterfaceInfoStatusEnum {

    BANNED("禁用", 0),
    ENABLE("启用", 1);

    private final String text;

    private final int value;

    UserInterfaceInfoStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
