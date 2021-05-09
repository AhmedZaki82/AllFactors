package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printFactors(-1);
    }

    public static void printFactors(int number) {

        if (number < 1) {

            System.out.println("Invalid Value!");
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                System.out.println(i + " Is a Factor for number " + number);
            }
        }
    }
}
