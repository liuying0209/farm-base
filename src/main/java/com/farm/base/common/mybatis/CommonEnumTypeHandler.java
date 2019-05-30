/*
 * Copyright 2016 htouhui.com All right reserved. This software is the
 * confidential and proprietary information of htouhui.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with htouhui.com.
 */

package com.farm.base.common.mybatis;


import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 ** @Date: 2018-12-19 17:44
 */
public class CommonEnumTypeHandler<E extends CommonEnum> extends BaseTypeHandler<E> {

    private Class<E> type;

    public CommonEnumTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
        E[] enums = type.getEnumConstants();
        if (enums == null) {
            throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getCode());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i = rs.getInt(columnName);
        return getColumnResult(rs, i);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int i = rs.getInt(columnIndex);
        return getColumnResult(rs, i);
    }



    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            return toEnum(i);
        }
    }

    private E getColumnResult(ResultSet rs, int i) throws SQLException {
        if (rs.wasNull()) {
            return null;
        } else {
            return toEnum(i);
        }
    }

    private E toEnum(int i) {
        try {
            return CommonEnum.getEnum(type, i);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cannot convert " + i + " to " + type.getSimpleName() + " by int value.", ex);
        }
    }


}
