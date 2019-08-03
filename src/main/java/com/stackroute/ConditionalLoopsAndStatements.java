package com.stackroute;

import java.util.Scanner;

//This class implements Condition and Loop Based Programs.
public class ConditionalLoopsAndStatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
    ConditionalLoopsAndStatements conditionalLoopsAndStatements=new ConditionalLoopsAndStatements();
        System.out.println(conditionalLoopsAndStatements.IfCondition(number));
        conditionalLoopsAndStatements.forCondition(number);
        conditionalLoopsAndStatements.doWhileCondition(number);
    }
    //This method is used to implement If Condition
    //To check whether the number is divisible by 3 or not
    //We Use a formal parameter to use it in main method
    public String IfCondition(int number){
       if(number%3==0){
       return "This given number is divisible by 3"; }
    else return "This given number is not divisible by 3";}

    //The given Method is for For Condition to print a loop of numbers using For Condition
    public void forCondition(int number){
        for(int i=0;i<number;i++){
            System.out.println("The result is"+i);
        }
    }

    
    public void doWhileCondition(int number){
        do{
            System.out.println(number=number+2);
        }
        while (number<50);
    }
public void switchCases(){

}}

