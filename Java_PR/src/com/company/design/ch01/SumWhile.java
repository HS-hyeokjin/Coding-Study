package com.company.design.ch01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= a){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }


}
