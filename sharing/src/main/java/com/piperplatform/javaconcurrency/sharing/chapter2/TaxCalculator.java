package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 4:29 下午
 * @Version 1.0
 */
public class TaxCalculator {

    private final double salary;
    private final double bonus;
    private final CalculatorStrategy calculatorStrategy;

    public TaxCalculator(double salary, double bonus, CalculatorStrategy calculatorStrategy) {
        this.salary = salary;
        this.bonus = bonus;
        this.calculatorStrategy = calculatorStrategy;
    }

    public double calculator() {
        return calculatorStrategy.calculate(salary, bonus);
    }
}
