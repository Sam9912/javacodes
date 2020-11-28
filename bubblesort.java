package com.company;

public class bubblesort {
    void sorting(int arr[])
    {
        int n=arr.length;
        int temp;
        for (int i=0; i<n-1;i++)
        {
            for (int j=0;j<n-1;j++)
            {
                if (arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        } }


    }

    public static void main(String[] args) {
        int a[]={12,5,11,0,1,7,9,2};
        bubblesort b=new bubblesort();
        System.out.println("the array before bubble sort is");
        for (int x=0;x<a.length;x++)
        {
            System.out.print(a[x] + " ");
        }

        b.sorting(a);

        System.out.println("\n the array after bubble sort is");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}
