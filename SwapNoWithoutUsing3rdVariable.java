package com.bridgelabz.review3;

public class SwapNoWithoutUsing3rdVariable {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("before swapping value of x and y: "+x+","+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping value of x and y: "+x+","+y);

    }
}
