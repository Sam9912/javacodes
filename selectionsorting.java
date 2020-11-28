package com.company;

public class selectionsorting {
    void sortarray(int arr[])
    {
        int l=arr.length;
        for (int i=0;i<l-1;i++)
        {
            int min=i;
            for (int j=i+1;j<l;j++)

                if(arr[j]<arr[min])
                    min=j;

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

    }

    public static void main(String[] args) {
        int m[]={6,2,0,4,54,11,21,5};
        selectionsort b=new selectionsort();
        b.sortarray(m);
        System.out.println("sorted array is ");
        for (int k=0;k<m.length;k++)
        {
            System.out.print(m[k] + " ");
        }

    }
}


