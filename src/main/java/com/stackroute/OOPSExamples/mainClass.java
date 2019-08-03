package com.stackroute.OOPSExamples;
import com.stackroute.ArraysExample;
import com.stackroute.ArraysExample.*;
import com.stackroute.StringBuilderExample;
import com.stackroute.StringIntegerConversion;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        String name=scanner.nextLine();
        int salary=scanner.nextInt();
        Integer integer=new Integer(10);
        int i1=integer;
        System.out.println(i1);
        Implementation implementation=new Implementation();
        implementation.method1();
        implementation.method2();

        InheritenceClass inheritenceClass=new InheritenceClass(age,salary);
        inheritenceClass.setAge(age);
        inheritenceClass.setSalary(salary);
        inheritenceClass.method1();
        implementation.method1Prog();
        implementation.method2Prog();
        StringIntegerConversion stringIntegerConversion=new StringIntegerConversion();
        System.out.println(stringIntegerConversion.integerConversion());
        System.out.println(stringIntegerConversion.stringConversion());
        StringBuilderExample stringBuilderExample=new StringBuilderExample();
        stringBuilderExample.stringBuilderReplacement(name,"Vijay");
//        inheritenceClass.method2();
//        ArraysExample arraysExample=new ArraysExample();
//        arraysExample.singleDimentionalExample(3);
//        System.out.println(inheritenceClass.method3(1,"Vijay",22));
//
        System.out.println(inheritenceClass.getAge());
        inheritenceClass.getSalary();
        System.out.println(inheritenceClass.getAge());


    }

}
