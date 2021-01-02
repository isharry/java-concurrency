package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 4:38 下午
 * @Version 1.0
 * FunctionalInterface 注解 : 编译器级别检查 必须确保只有一个接口 确保是函数式编程风格
 */
@FunctionalInterface
public interface CalculatorStrategy {
    double calculate(double salary, double bonus);
}
