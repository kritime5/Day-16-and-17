package com.ds;

public class BinarySearchString {
    static int binarySearch(String[] arr, String x)
    {
        int a = 0, b = arr.length - 1;
        while (a <= b) {
            int y = a + (b - a) / 2;

            int result = x.compareTo(arr[y]);

            if (result == 0)
                return y;
            if (result > 0)
                a = y + 1;

            else
                b = y - 1;
        }

        return -1;
    }


    public static void main(String []args)
    {
        String[] arr = { "school", "temple", "church", "place"};
        String x = "place";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}

