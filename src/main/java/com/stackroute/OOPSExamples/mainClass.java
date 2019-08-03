package com.stackroute.OOPSExamples;
import com.stackroute.ArraysExample;
import com.stackroute.ArraysExample.*;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        String name=scanner.nextLine();
        int salary=scanner.nextInt();
//        Implementation implementation=new Implementation();
//        implementation.method1();
//        implementation.method2();
        InheritenceClass inheritenceClass=new InheritenceClass(age,salary);
        inheritenceClass.setAge(age);
        inheritenceClass.setSalary(salary);
        inheritenceClass.method1();

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
