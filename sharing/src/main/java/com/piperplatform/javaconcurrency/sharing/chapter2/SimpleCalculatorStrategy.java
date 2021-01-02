package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 4:42 下午
 * @Version 1.0
 */
public class SimpleCalculatorStrategy implements CalculatorStrategy {
    @Override
    public double calculate(double salary, double bonus) {
        return salary * 0.1 + bonus * 0.2;
    }
}
