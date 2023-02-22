package com.company.design.programers;


import java.util.Arrays;

class Solution {
    //평균값
    public double solution1(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }

    //양꼬치
    public int solution2(int n, int k) {
        int answer = 0;
        k -= n / 10;
        answer += n * 12000 + k * 2000;
        return answer;
    }

    //짝수 홀수 개수
    public int[] solution3(int[] num_list) {
        int[] answer = {0, 0};
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 1) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }

    //배열 원소의 길이
    public int[] solution4(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[0] = strlist[i].length();
        }
        return answer;
    }

    //배열 뒤집기
    public int[] solution5(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }

        return answer;
    }

    //피자 나눠 먹기(3)
    public int solution6(int slice, int n) {
        int answer = 0;
        answer = n / slice;
        if (n % slice > 0) {
            answer += 1;
        }

        return answer;
    }

    //문자 반복 출력하기
    public String solution7(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //문자열 뒤집기
    public String solution8(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.substring(i, i + 1);
        }
        return answer;
    }

    //배열 자르기
    public int[] solution9(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < num2 - num1 + 1; i++) {
            answer[i] = numbers[num1 + i];
        }
        return answer;
    }

    //특정 문자 제거하기
    public String solution10(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

    //짝수의 합
    public int solution11(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    //외계행성의 나이
    public String solution12(int age) {
        String answer = "";
        String ageString = String.valueOf(age);
        String[] a = ageString.split("");

        for (int i = 0; i < a.length; i++) {
            answer += ((char) ((Integer.parseInt(a[i]) + 97)));
        }

        return answer.toString();
    }

    //진료 순서 정하기
    public int[] solution13(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int k = 1; k <= emergency.length; k++) {
            int max = 0;
            for (int j = 0; j < emergency.length; j++) {
                for (int i = 0; i < emergency.length; i++) {
                    if (emergency[i] > max) {
                        max = emergency[i];
                    }
                }
                if (emergency[j] == max) {
                    answer[j] = k;
                    emergency[j] = 0;
                }
            }
        }
        return answer;


    }


}
