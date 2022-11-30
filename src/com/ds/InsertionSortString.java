package com.ds;

import java.util.Arrays;

public class InsertionSortString {
    public static void main(String args[]) {
        String[] arr = {"Computer", "Ipod", "Laptop", "Earphone"};
        int size = arr.length;

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if(arr[i].compareTo(arr[j])>0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

