package com.nhlstenden.bigoexamples.good_bigO;

public class Example {
    //exaple of an Big O(Log n)
    public void loopTroughList(int n ) {
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }

}
