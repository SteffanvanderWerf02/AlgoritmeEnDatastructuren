package com.nhlstenden.bigoexamples.horrible_bigO;

public class Example {
    public void printAllPossibleOrderedPairs(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.println(arr[i] + " = " + arr[j] +"\n");
            }
        }
    }
}
