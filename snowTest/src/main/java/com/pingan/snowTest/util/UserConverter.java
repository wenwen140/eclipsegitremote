package com.pingan.snowTest.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.cglib.core.Converter;

public  class UserConverter implements Converter {
 
    /**
     * 时间转换的格式
     */
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 
    /**
     * 自定义属性转换
     * @param value 源对象属性类
     * @param target 目标对象里属性对应set方法名,eg.setId
     * @param context 目标对象属性类
     * @return
     */
    @SuppressWarnings("rawtypes")
	@Override
    public Object convert(Object value, Class target, Object context) {
        if (value instanceof Integer) {
            return value;
        } else if (value instanceof LocalDateTime) {
            LocalDateTime date = (LocalDateTime) value;
            return dtf.format(date);
        } else if (value instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal) value;
            return bd.toPlainString();
        }
        // 更多类型转换请自定义
        return value;
    }
    
}
