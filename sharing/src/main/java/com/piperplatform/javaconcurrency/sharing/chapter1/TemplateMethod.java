package com.piperplatform.javaconcurrency.sharing.chapter1;

/**
 * @Author shiyoufeng
 * @Date 2020/12/28 1:25 下午
 * @Version 1.0
 */
public class TemplateMethod {
    public void print(){
        System.out.println("******************");
        method();
        System.out.println("******************");
    }
    protected void method(){

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void method() {
                System.out.println("#"+"Hello Thread"+"#");
            }
        };
        t1.print();
        TemplateMethod t2 = new TemplateMethod(){
            @Override
            protected void method() {
                System.out.println("+"+"Hello Thread"+"+");
            }
        };
        t2.print();

    }
}
