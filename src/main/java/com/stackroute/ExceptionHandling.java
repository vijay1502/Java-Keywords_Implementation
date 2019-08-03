package com.stackroute;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        String c=scanner.next();
        ExceptionHandling exceptionHandling=new ExceptionHandling();
        System.out.println(exceptionHandling.arithmeticException(a,b));
        System.out.println(exceptionHandling.nullPointerException(null));
        System.out.println(exceptionHandling.arrayOutOfBound(6));
    }

    public String arithmeticException(int a,int b){
        int c;
        try {
            c=a/b;
            return ("output is"+c);
        }
        catch (ArithmeticException ex){
            return "This is an Arithmetic Exception";
        }
    }

    public String nullPointerException(String a){
        try{
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'){
            continue;
            }
            }
            return "THe String has a character"; }
        catch (NullPointerException nuller){
            return "This is Null pointer exception";

        }
        }

        public String arrayOutOfBound(int number){
        int[] a=new int[5];
        try{
        for (int i=0;i<number;i++){
            a[i]=i+1;
            }return a.toString();
        }
    catch (ArrayIndexOutOfBoundsException aibe){
            return "Array Index out of Bounds";
    }
    finally {
            return "This is Finally Block";
        }
        }

}
