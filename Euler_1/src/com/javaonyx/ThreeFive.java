package com.javaonyx;

import java.util.List;
import java.util.ArrayList;

public class ThreeFive {

    int n;

    public int getN() { return n; }
    public void setN( int n ) { this.n = n; }

    public ThreeFive( int n ) { this.n = n; }

    public void runThreeFive() {
        int num = getN();
        System.out.println("Your Number is: " + num);
        System.out.println("<------------------>");
        System.out.println("The divisibles are:\n ");

        List divArr = new ArrayList();

        for(int i = 0; i <= num; i++) {
            if(i % 3 == 0 || i % 5 == 0) { divArr.add(i); }
        }
        System.out.println(divArr);
    }
}