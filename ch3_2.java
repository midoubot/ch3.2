package com.command;

import java.util.Random;
import java.util.Scanner;

public class ch3_2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;
        int num3 = rand.nextInt(100) + 1;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);

        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the sum of " + num1 + ", " + num2 + ", and " + num3);
        int nm = n.nextInt();

        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " = " + nm);

        if (nm == num1 + num2 + num3)
            System.out.println("Your answer is correct!");
        else
            System.out.println("Your answer is incorrect");

    }
}