package com.stackroute.OOPSExamples;

public class InheritenceClass extends Implementation{
     private int age;
    private int salary;

    public InheritenceClass(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void method1() {

        System.out.println("Heyyyy");
    }

    @Override
    public void method2() {

        System.out.println("Hoyyyy");
    }
    public String method3(int serial,String name,int age){
        return ("serial is "+serial+" name is "+name+" age is "+age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
