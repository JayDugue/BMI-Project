package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { ;

        float meters;
        float kg;
        float inches;
        float pounds;
        float BMI;
        Scanner input;

        String greeting;
        String name;
        Scanner keyboard;


        keyboard = new Scanner(System.in);
        System.out.println("Hi");
        greeting = keyboard.nextLine();
        System.out.println("Whats your name?");
        name = keyboard.nextLine();
        input = new Scanner(System.in);
        System.out.println("How tall are you(in inches)?");
        inches = (float) input.nextDouble();
        meters = (float) (inches*(0.0254/1));
        System.out.println("How much do u weigh(in pounds)?");
        pounds = (float) input.nextDouble();
        kg = (float) (pounds / (2.20462/1));
        System.out.println(kg);


        BMI = kg/(meters*meters);

        System.out.println("your BMI is " + BMI + ".");













    }
}
