package com.company;

public class bubblesorting {
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
        int a[]={8,-1,76,4,13,25,0,1};
        bubblesort b=new bubblesort();
        b.sorting(a);
        System.out.println("sorted array is ");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}


