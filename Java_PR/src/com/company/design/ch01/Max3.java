// 세 수를 입력받아 최대값을 찿는 알고리즘

package com.company.design.ch01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수의 최대값");
        System.out.println("a : "); int a = stdIn.nextInt();
        System.out.println("b : "); int b = stdIn.nextInt();
        System.out.println("c : "); int c = stdIn.nextInt();

        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;

        System.out.println("최대값은" + max);
    }
}
