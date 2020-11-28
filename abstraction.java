package com.company;
abstract class Shapes
{
    public String name;
public Shapes()
{
    name="none";
}
    public Shapes(String name) {
        this.name = name;
    }
    abstract void shapename();
abstract void getarea();
}
class rectangle extends Shapes
{
    private int length;
    private int width;


    public rectangle(java.lang.String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
        ;
    }

    public void shapename()
    {
        System.out.println("the shape is: "+ this.name);
    }
    public void getarea()
    {
        System.out.println("the area of rectangle is: "+ length*width);
    }


}

public class abstraction {
    public static void main(String[] args) {
        Shapes s=new rectangle( "rectangle",5,4);
        s.shapename();
        s.getarea();

    }
}
