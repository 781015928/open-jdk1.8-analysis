/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package java.util.function;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * long-valued result.  This is the {@code int}-to-{@code long} primitive
 * specialization for {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsLong(int)}.
 *
 * @see Function
 * @since 1.8
 */ // 由 GaoZhilai 进行分析注释, 不正确的地方敬请斧正, 希望帮助大家节省阅读源代码的时间 2020/4/25 20:01
@FunctionalInterface
public interface IntToLongFunction { /** 函数式接口, 代表一个接收int类型参数返回double结果的函数, 是{@link Function}的特定版本 */

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */ // 执行具体实现类逻辑, 接收一个int参数, 返回一个long结果
    long applyAsLong(int value);
}
