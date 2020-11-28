package com.company;

public class person {
 String name;
 int age;
 person()
 {

 }

    person(String n,int a)
    {
        name=n;
        age=a;
    }

    public static void main(String[] args) {
        person p=new person("mesum",20);
        System.out.println(p.name+"  " +p.age);
    }
}
