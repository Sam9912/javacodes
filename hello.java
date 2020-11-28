package com.company;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {


        System.out.println("enter the size of array");
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        int a[] = new int[s];
        System.out.println("enter the elements of the array");
        for (int i=0;i<s;i++)
        {
            a[i]=n.nextInt();
        }

        for (int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }

    }
}