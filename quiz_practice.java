package com.company;
import java.util.Scanner;
class student
{
    private String name;
    private int age;
    public student()
    {
        name="ALI";
        age=17;
    }

    public student(String name, int age ) {
        this.name=name;
        this.age=age;
    }
    void displayinfo()
    {
        System.out.println("name of student is: "+ name);
        System.out.println("age of student is: "+ age);

    }
}
public class quiz_practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        student m=new student("Mesum",20);
        m.displayinfo();
    }
}