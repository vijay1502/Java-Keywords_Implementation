package com.stackroute;

public class StringIntegerConversion {
    public int stringConversion() {
        String string = "201";
        int integer = Integer.parseInt(string);
        return integer;
    }

    public String integerConversion() {
        int integer = 100;
        String result = Integer.toString(integer);
        return result;
    }
}
