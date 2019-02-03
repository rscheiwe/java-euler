package com.javaonyx;

import java.util.List;
import java.util.ArrayList;

public class FibonacciSum {
    int n; //number to count Fibonacci sequence to

    public int getN() { return n; }
    public void setN( int n ) { this.n = n; }

    public FibonacciSum( int n ) { this.n = n; }

    List fibSeq = new ArrayList();

    private int fibonacciSeq(int num) {
        System.out.println(fibSeq);
    }

    public void fibonacciSeqRun() {
        int num = getN();

    }

}