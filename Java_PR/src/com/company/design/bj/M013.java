package com.company.design.bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i =1 ; i <= N ; i ++){
            myQueue.add(i);
        }
        while(myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}
