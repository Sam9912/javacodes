package com.company;
import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//try {
//
//
//    System.out.println("enter your current semester gpa");
//float gp1=s.nextFloat();
//    System.out.println("enter your prev semester gpa");
//    float gp2=s.nextFloat();
//    if(gp1>4.0 || gp2>4.0)
//    {
//        throw new IllegalArgumentException("please enter gpa less than 4.0");
//
//    }
//    else {
//        float cgpa=(gp1+gp2)/2;
//        System.out.println("your cgpa is: "+cgpa);
//    }
//    }
//catch (IllegalArgumentException e)
//{
//    System.out.println("please enter gpa less than 4.0");
//}
//finally {
//    System.out.println("good luck for this semester");
//}
        String p;
        try{
            System.out.println("enter any string");
             p = s.nextLine();


             if (p.length()<1)
             {
                 p=null;
                 throw new NullPointerException("(Null Pointer Exception) please enter a valid string");
             }
                else
             {
                 System.out.println("the length of string is: "+p.length());
             }
            }

        catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Have A good day");
        }

    }

}

