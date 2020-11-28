package com.company;
class shape
{
    public void display()
    {
        System.out.println("this is a super class of shapes");

    }

}
class circle extends shape
{
    int r;
    circle(int a)
    {
        r=a;
    }
    public void display()
    {
        super.display();
        double area = 3.14*r*r;
        System.out.println("the are of circle is "+area);
    }

}

public class example {
    public static void main(String[] args) {
        circle c=new circle(5);
        c.display();
    }
}
