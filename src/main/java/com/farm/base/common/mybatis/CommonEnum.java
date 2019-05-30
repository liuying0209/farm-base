/*
 * Copyright 2016 htouhui.com All right reserved. This software is the
 * confidential and proprietary information of htouhui.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with htouhui.com.
 */

package com.farm.base.common.mybatis;

/**
 ** @Date: 2018-12-19 17:44
 */
public interface CommonEnum {

    int getCode();

    String getMsg();

    /**
     * 获取枚举值对应的枚举
     *
     * @param enumClass 枚举类
     * @param enumValue 枚举值
     * @return 枚举
     */
    static <E extends CommonEnum> E getEnum(final Class<E> enumClass, final Integer enumValue) {
        if (enumValue == null) {
            return null;
        }
        try {
            return valueOf(enumClass, enumValue);
        } catch (final IllegalArgumentException ex) {
            return null;
        }
    }

    /**
     * 获取枚举值对应的枚举
     *
     * @param enumClass 枚举类
     * @param enumValue 枚举值
     * @return 枚举
     */
    static <E extends CommonEnum> E valueOf(Class<E> enumClass, Integer enumValue) {
        if (enumValue == null) {
            throw new NullPointerException("EnumValue is null");
        }

        E[] enums = enumClass.getEnumConstants();
        if (enums == null || enums.length == 0) {
            throw new IllegalArgumentException(enumClass.getSimpleName() + " does not represent an enums type.");
        }
        for (E t : enums) {
            if (t.getCode() == enumValue) {
                return t;
            }
        }
        throw new IllegalArgumentException(String.format("Unknown enums value : %s(%s)", enumClass.getSimpleName(), enumValue));
    }

}
