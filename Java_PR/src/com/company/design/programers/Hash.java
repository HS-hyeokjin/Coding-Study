package com.company.design.programers;

import java.util.HashSet;

public class Hash {
    //폰켄몬
    public int solution1(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        int max = nums.length / 2;
        for (int i : nums) {
            numsSet.add(i);
        }

        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }
    }

    // 완주하지 못한 선수
    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        HashSet<String> hs = new HashSet<>();
        for(String i : participant){

        }
        return answer;
    }

    //참여자 3 완주자 2

}
