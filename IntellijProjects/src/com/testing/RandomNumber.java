package com.testing;

import java.lang.Math;

public class RandomNumber {
    private int maxNumber = 10;
    private int minNumber = 1;
    private int currentNumber;

    //Constructor
    public RandomNumber(){
        this.maxNumber = 1;
        this.minNumber = 0;
        this.currentNumber = 0;
    }

    public RandomNumber(int min, int max){
        this.maxNumber = max;
        this.minNumber = min;
        this.currentNumber = 0;
    }

    //Methods
    public int rollNumber(){
        this.currentNumber = (int) (Math.random()*this.getMaxNumber())+this.getMinNumber();
        return this.currentNumber;
    }

    public void printInterval(){
        System.out.println("-- Using numbers between "+this.getMinNumber()+" and "+this.getMaxNumber()+" --\n\n");
    }

    //Getters and Setters
    public int getCurrentNumber(){
        return currentNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }
}
