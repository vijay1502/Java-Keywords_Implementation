package com.stackroute;

public class StringBuilderExample {
    public String stringBuilderReplacement(String name,String output){
    StringBuilder stringBuilder=new StringBuilder();
    String result=name.replaceAll(name,output);
    return result;
    }
}
