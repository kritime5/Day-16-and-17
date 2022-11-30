package com.ds;

public class InsertionSort {
    void bubbleSort(int arr[])
    {
        int a = arr.length;
        for (int i = 0; i < a- 1; i++)
            for (int j = 0; j < a - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }


    void printArray(int arr[])
    {
        int b = arr.length;
        for (int i = 0; i < b; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        InsertionSort s = new InsertionSort();
        int arr[] = { 7,8,5,4,3,9,10 };
        s.bubbleSort(arr);
        System.out.println("Sorted array");
        s.printArray(arr);
    }
}

