package com.bridgelabz.review3;

import java.util.Scanner;

public class CountOfSmallestElement {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0];
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    count = 1;
                } else if (arr[i] == min) {
                    count++;
                }
            }

            System.out.println("The smallest element in the array is " + min );
            System.out.println("The count of the smallest element in the array is " + count );
        }
}


