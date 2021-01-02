package com.piperplatform.javaconcurrency.sharing.chapter2;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 4:32 下午
 * @Version 1.0
 */
public class TaxCalculatorMain {
    public static void main(String[] args) {
//        TaxCalculator taxCalculator = new TaxCalculator(10000, 2000, new SimpleCalculatorStrategy());
        TaxCalculator taxCalculator = new TaxCalculator(10000, 2000, (s, b) -> s * 0.1 + b * 0.15);
        System.out.println(taxCalculator.calculator());
    }
}
