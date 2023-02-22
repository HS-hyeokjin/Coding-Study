package com.company.design.ch06;

import java.util.Arrays;

public class Sort {

    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
    // 1. 버블 정렬
    static void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j - 1] > array[j])
                    swap(array, j - 1, j);
            }
        }
    }

    // 2. 선택 정렬
    static void selectSort(int[] array, int n){
        for (int i = 0; i< n -1; i++){
            int min = i;
            for (int j = i+1; j< n; j++){
                if(array[j] < array[min])
                    min = j;
                swap(array, i, min);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {7, 3, 1, 4, 5, 2};
        int n = 6;
        // bubbleSort(a, n);
        // selectSort(a, n);
        System.out.println("정렬 : " + Arrays.toString(a));
        }
    }
