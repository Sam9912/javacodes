package com.company;

abstract class shapes
{
    public abstract void drawshape();
    public void hello()
    {
        System.out.println("hello world");
    }


}
class circles extends shapes
{
    
    public void drawshape()
    {
        System.out.println("drawing a circle");
    }
}

public class practice {
    public static void main(String[] args) {


        shapes s = new circles();
        s.drawshape();
        s.hello();
    }
}