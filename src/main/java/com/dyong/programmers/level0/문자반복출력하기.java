package com.dyong.programmers.level0;

public class 문자반복출력하기 {
    public static void main(String[] args) {
        System.out.println("문자 반복 출력하기 : " + solution("hello",3));
    }

    public static String solution(String my_string, int n) {
        String str = "";

        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            for(int j=0; j<n; j++) str += ch;
        }

        return str;
    }
}
