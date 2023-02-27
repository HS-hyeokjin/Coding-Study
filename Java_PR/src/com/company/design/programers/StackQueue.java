package com.company.design.programers;

import java.util.*;

public class StackQueue {

    //같은 숫자는 싫엉엉
    public int[] solution1(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0 || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    //기능 개발
    public int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        int cnt = 1;
        int now = queue.poll();

        //계산 값을 큐에 담음!
        for (int i = 0; i < progresses.length; i++) {
            queue.add((100 - progresses[i]) / speeds[i] + (100 - progresses[i] % speeds[i] == 0 ? 0 : 1));
        }

        while (!queue.isEmpty()) {
            int next = queue.poll();
            if (now >= next) cnt++;
            else {
                array.add(cnt);
                now = next;
                cnt = 1;
            }
        }
        array.add(cnt);

        int[] answer = new int[array.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }

    //올바른 괄호
    boolean solution3(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() == 0) {
                return false;
            } else if (s.charAt(i) == ')' && stack.empty() == false) {
                stack.pop();
            } else if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
        }
        if (stack.empty() == false){
            return false;
        }
        return answer;
    }

    //프린터
    public int solution(int[] priorities, int location) {
        int answer = 0;
        return answer;
    }
}


