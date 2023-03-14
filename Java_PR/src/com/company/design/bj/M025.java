package com.company.design.bj;

import java.util.ArrayList;
import java.util.Scanner;

public class M025 {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    static boolean arrive;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        arrive = false;
        visited = new boolean[n];
        a = new ArrayList[n];
        for ( int i = 0; i< n; i++){
            a[i] = new ArrayList<Integer>();
        }
        for(int i=0; i< m; i++){
            int S = scanner.nextInt();
            int E = scanner.nextInt();
            a[S].add(E);
            a[E].add(S);
        }
        for (int i =0 ; i< n; i++){
            DFS(i,1);
            if (arrive)
                break;
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void DFS(int now, int depth){
    if(depth == 5 || arrive){
        arrive =true;
        return;
    }
    visited[now] = true;
    for (int i : a[now]){
        if(!visited[i]){
            DFS(i, depth +1);
        }
    }
    visited[now] =false;
    }
}
