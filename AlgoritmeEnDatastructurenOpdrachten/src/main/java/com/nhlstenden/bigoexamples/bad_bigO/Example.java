package com.nhlstenden.bigoexamples.bad_bigO;

public class Example {
    public int factorial(int n) {
        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }

}
