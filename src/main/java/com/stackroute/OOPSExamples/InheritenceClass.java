package com.stackroute.OOPSExamples;



public class InheritenceClass extends Implementation{
     private int age;
    private int salary;

    public InheritenceClass(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int method1() {

        return 22;
    }

    @Override
    public String method2() {
        super.method2();
        return "VVIjay";
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
