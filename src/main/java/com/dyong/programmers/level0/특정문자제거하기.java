package com.dyong.programmers.level0;

public class 특정문자제거하기 {

    public static void main(String[] args) {
        특정문자제거하기 abc = new 특정문자제거하기();
        System.out.println("특정 문자 제거하기 : " + abc.solution("Cdddoldda", "d"));
    }

    public String solution(String my_string, String letter) {
        String new_string = my_string.replace(letter, "" );
        return new_string;
    }
}
