package com.company.design.bj;


import java.util.Scanner;
//연속된 자연수의 합
public class M006 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != N) {
            if (sum == N) {
                cnt++;
                end++;
                sum = sum + end;
            } else if (sum > N) {
                sum = sum - start;
                start++;
            } else {
                end++;
                sum = sum + end;
            }
        }

        System.out.println(cnt);

    }
}

