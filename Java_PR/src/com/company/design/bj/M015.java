package com.company.design.bj;

import java.util.Scanner;

public class M015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j < N - 1; j++) {
            for (int i = 0; i < N - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }


        }
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }
    }
}