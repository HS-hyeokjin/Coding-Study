package com.company.design.ch01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0 )
            System.out.println("양수");
        else
            System.out.println("0 또는 음수");
    }
    }

