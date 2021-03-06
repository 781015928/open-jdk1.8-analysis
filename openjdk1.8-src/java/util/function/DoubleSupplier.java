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
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link Supplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #getAsDouble()}.
 *
 * @see Supplier
 * @since 1.8
 */ // 由 GaoZhilai 进行分析注释, 不正确的地方敬请斧正, 希望帮助大家节省阅读源代码的时间 2020/4/25 18:42
@FunctionalInterface
public interface DoubleSupplier { /** 函数式接口, 代表了一个double类型结果的生产者, 是{@link Supplier}特定返回结果类型版本 */

    /**
     * Gets a result.
     *
     * @return a result
     */ // 调用实现类逻辑, 返回一个double类型的结果
    double getAsDouble();
}
