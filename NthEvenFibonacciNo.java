package com.bridgelabz.review3;
//
import java.util.Scanner;
//
public class NthEvenFibonacciNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int f1 = 0, f2 = 2, f3 = 0;
        int count = 2;

        if (n < 1) {
            System.out.println("Invalid input. enter positive no:");
        } else {
            while (count < n) {
                f3 = 4 * f2 - f1;
                f1 = f2;
                f2 = f3;
                count++;
            }

            System.out.println("The " + n + "th even Fibonacci number is " + f2 + ".");
        }
    }

}



