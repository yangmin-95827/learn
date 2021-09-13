package com.jvm02.yang;

public class MovingAverage {

    private int count = 0;
    private double sum = 0.0d;

    public void submit(double value){
        this.count ++;
        this.sum += value;
    }

    public double getAvg(){
        if(0 == this.count){
            return sum;
        }
        return this.sum / this.count;
    }


}
