package com.javaonyx;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ThreeFive {

    int n;

    public int getN() { return n; }
    public void setN( int n ) { this.n = n; }

    public ThreeFive( int n ) { this.n = n; }

    public void runThreeFive() {
        int num = getN();
        int sum = 0;

        {
            System.out.println("Your Number is: " + num);
            System.out.println("<------------------>");
//            System.out.println("The divisibles are:\n ");
        }

        List divArr = new ArrayList();

        for(int i = 0; i < num; i++) {
            if(i % 3 == 0 || i % 5 == 0) { divArr.add(i); }
        }
        for(Integer i : ( ArrayList<Integer> )divArr) { sum += i; }

//        System.out.println(divArr);
        System.out.println("The SUM is: " + sum);

    }
}