package com.company;

public class selectionsort {
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
        int m[]={16,3,1,19,14,5,2,7};
        selectionsort b=new selectionsort();
        System.out.println("the array before selection sort is");
        for (int x=0;x<m.length;x++)
        {
            System.out.print(m[x] + " ");
        }
        b.sortarray(m);

        System.out.println("\nthe array after selection sort is");
        for (int k=0;k<m.length;k++)
        {
            System.out.print(m[k] + " ");
//            System.out.println();
        }

    }
}
