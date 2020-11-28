package com.company;
import java.util.Scanner;
public class exceptionhandling {
    public static void main(String[] args) {

        try {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            Scanner scr=new Scanner(System.in);
            System.out.println("enter the index of element you want to access");
            int num=scr.nextInt();
            System.out.println("the index is: "+arr[num]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("undefined index:  " + e);
        }
        finally {

            System.out.println("this statment will be executed finally");
        }
    }
}