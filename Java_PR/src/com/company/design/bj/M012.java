package com.company.design.bj;

import java.io.*;
import java.util.Stack;

public class M012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[]array = new int[n];
        int[]ans = new int[n];
        String[] str = bf.readLine().split(" ");
        for(int i = 0; i < n ; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);
        for(int i =0; i<n; i++){
            while (!myStack.isEmpty() && array[myStack.peek()] < array[i]){
                ans[myStack.pop()] = array[i];
            }
            myStack.push(i);
        }
        while(!myStack.empty()){
            ans[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i< n; i++){
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.flush();
    }

}
