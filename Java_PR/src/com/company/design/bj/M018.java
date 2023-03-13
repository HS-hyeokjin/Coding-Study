package com.company.design.bj;

import java.util.Scanner;

public class M018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int [N];
        int sum[] = new int [N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        for(int i=1; i< N; i++){
            int insert_point = i;
            int insert_value = array[i];
            for(int j = i-1 ; j>=0 ; j--){
                if(array[j] < array[i]){
                    insert_point= j+1;
                    break;
                }
                if(j ==0){
                    insert_point = 0;
                }
            }
            for(int j = i ; j > insert_point; j--){
                array[j] = array[j-1];
            }
            array[insert_point] = insert_value;

        }

        sum[0] = array[0];
        for(int i = 1; i< N ; i++){
            sum[i] = sum[i-1] + array[i];
        }
        int result = 0;
        for(int i = 0 ; i < N ; i++){
            result = result + sum[i];
        }
        System.out.println(result);
    }
}
