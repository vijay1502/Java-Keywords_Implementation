package com.stackroute;

import java.util.Scanner;

//This class implements Condition and Loop Based Programs.
public class ConditionalLoopsAndStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ConditionalLoopsAndStatements conditionalLoopsAndStatements = new ConditionalLoopsAndStatements();
        System.out.println(conditionalLoopsAndStatements.IfCondition(number));
        conditionalLoopsAndStatements.forCondition(number);
        conditionalLoopsAndStatements.doWhileCondition(number);
        conditionalLoopsAndStatements.switchCases(number);
    }

    //This method is used to implement If Condition
    //To check whether the number is divisible by 3 or not
    //We Use a formal parameter to use it in main method
    public String IfCondition(int number) {
        if (number % 3 == 0) {
            return "This given number is divisible by 3";
        } else return "This given number is not divisible by 3";
    }

    //The given Method is for For Condition to print a loop of numbers using For Condition
    public void forCondition(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("The result is" + i);
        }
    }

    //While the given number is less than 50, it starts counting...else it doesn't
    public void doWhileCondition(int number) {
        do {
            System.out.println(number = number + 2);
        }
        while (number < 50);
    }

    //This Class will provide option based output, using switch case statements
//The selected option will check 3 cases, whether they are unique, dual or triple in nature using switch cases
    public void switchCases(int number) {
        switch (number) {
            //WE switch to a particular number
            case 1:
                System.out.println("THe given number is unique");
                break;
            case 2:

                System.out.println("The given number is Dual");
                break;
            case 3:

                System.out.println("The given number is Triple");
                break;
            default:
                System.out.println("The given numer is " + number);
                break;
        }
    }
}

