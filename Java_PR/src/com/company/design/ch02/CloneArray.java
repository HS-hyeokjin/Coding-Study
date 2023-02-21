package com.company.design.ch02;

public class CloneArray {
    public static void main(String[] args) {
        int[] a =  {1,2,3,4,5,6,7,8,9,10};
        int[] b = a.clone();

        b[3] = 0;


    }
}
