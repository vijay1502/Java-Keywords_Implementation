package com.stackroute.OOPSExamples;

public interface InetrfaceProgram {
    public int method1();
    //Here we Provide Default Methods for interface
    default void method1Prog(){
        System.out.println("Method 1 should define age of a person and return it");
    }
    public String method2();
    default void method2Prog(){
        System.out.println("Method 2 shold pring name of the user");
    }
}
