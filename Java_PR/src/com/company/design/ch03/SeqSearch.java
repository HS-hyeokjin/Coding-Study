package com.company.design.ch03;

public class SeqSearch {

        // 개수가 n 개인 배열을 받고 값을 받는 함수작성
        static int seqSearch(int[] a, int n, int key){
            int i = 0;
            while (true){
                if(i==0){ return -1;}
                if(a[i] == key) {return i;}
                i++;

            }

    }
}
