package com.sky.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.sky.enumeration.OperationType;
import java.lang.annotation.RetentionPolicy;

/**
 * 用于在插入或更新数据库记录时，自动填充创建人、更新人、创建时间、更新时间等字段
 * AutoFill
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value();
}
        
