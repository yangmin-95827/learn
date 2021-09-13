package com.jvm02.yang;

public class LocalVariableTest {


    public static void main(String[] args) {

        MovingAverage ma = new MovingAverage();
        int num1 = 1;
        int num2 = 2;
        int num3 = 6;
        int num4 = 606;
        double num5 = 6.6;
        ma.submit(num1);
        ma.submit(num2);
        double avg = ma.getAvg();
    }
}
