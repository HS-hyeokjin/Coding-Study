package com.company.design.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//좋은 수 구하기
public class M008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long[] A  = new Long[N];
        for(int i = 0; i <N ; i++){
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        int Result = 0;
        for(int k =0; k< N; k++){
            long find = A[k];
            int i = 0;
            int j = N - 1;
            while (i < j){
                if(A[i] + A[j] == find) {
                    if (i != k && j != k) {
                        Result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                }
                else if (A[i] + A[j] < find){
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(Result);
        bf.close();
    }
}
