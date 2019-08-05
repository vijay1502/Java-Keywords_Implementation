package com.stackroute;

import java.util.Scanner;

//This class will generate different array based Outputs
//We create methods to define different dimensions and call them into main method
public class ArraysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.singleDimentionalExample(inputNumber);
        arraysExample.twoDimensionalArrayExample(inputNumber, inputNumber);
    }

    //This method will provide us the string array based output on Single Dimension
    public void singleDimentionalExample(int input) {
        //We consider the formalinput and is used as the lengthof the array
        //We increment each value of number by 1 and output it as a String Array
        int[] number = new int[input];
        String[] output = new String[input];
        for (int i = 0; i < input; i++) {
            number[i] = i + 1;
            String temporary = "The result is " + number[i];
            output[i] = temporary;

        }
        for (int i = 0; i < input; i++) {
            System.out.println(output[i].toString());
        }
    }

    //This method is meant to define 2 dimensional array output
    //We provide HardCoded and User INput Based Output
    public void twoDimensionalArrayExample(int rows, int columns) {
        //The input hardCode input will not help user to use his own values
        Scanner scanner = new Scanner(System.in);
        int[][] hardCodedInput = {{2, 3}, {2, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(hardCodedInput[i][j] + " ");
            }
            System.out.println("\n");
        }

        int[][] userBasedInput = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int a = scanner.nextInt();
                userBasedInput[i][j] = a;

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(userBasedInput[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
