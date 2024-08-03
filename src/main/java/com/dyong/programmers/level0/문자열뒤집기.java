package com.dyong.programmers.level0;

import java.util.Arrays;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("hello"));
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] carr = my_string.toCharArray();

        for(int i=carr.length; i>0; i--){
            answer += carr[i-1];
        }

        return answer;
    }
}
