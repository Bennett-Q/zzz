package com.zq;

/**
 * @author 张琪
 * @description java8测试
 * @date 2019/8/27 14:41
 */
public class Java8Test {
    public static void main(String[] args) {
        Java8Test test = new Java8Test();

        //类型声明
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(test.operate(11,12,addition));
    }
    interface MathOperation {
        int operation(int a, int b);
    }
    interface GreetingSerive{
        void sayMessage(String message);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
