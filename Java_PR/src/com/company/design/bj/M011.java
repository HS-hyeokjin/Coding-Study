package com.company.design.bj;

import java.util.Scanner;
import java.util.Stack;

//스택으로 오름차순 수열 만들기
public class M011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[]array = new int[N];
        for(int i = 0 ; i < N; i++){
            array[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < array.length; i++){
            int now = array[i];
            if (now >= num) {
                while (now >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else {
                int n = stack.pop();
                if(n>now){
                    System.out.println("NO");
                    result =false;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
