package com.stackroute;

interface GenericsExample<G1,G2> {
    G1 stringBasedOutput(G1 generic1);
    G2 stringReplace(G2 generic2);
}
public class Generics implements GenericsExample<String,String>{

       public String stringBasedOutput(String generic1) {
        generic1="Hello World";
        return generic1;
    }

    public String stringReplace(String generic2) {
       String genericsOutput = generic2.replace(generic2,"Vijay");
        return genericsOutput;
    }

    public static void main(String[] args) {
        Generics generics=new Generics();
        System.out.println(generics.stringBasedOutput("Hello"));
        System.out.println(generics.stringReplace("Heyy"));
    }
}