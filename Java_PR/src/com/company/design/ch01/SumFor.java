package com.company.design.ch01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;
        int sum = 0;

        for(i = 0 ; i < a; i++){
            sum += i;
        }

        System.out.println(sum);

    }
}
