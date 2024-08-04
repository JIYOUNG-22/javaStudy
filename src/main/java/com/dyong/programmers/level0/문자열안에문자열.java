package com.dyong.programmers.level0;

public class 문자열안에문자열 {

    public static void main(String[] args) {
        System.out.println("문자열 안에 문자열 : " + solution("ppprrrogrammers","pppp"));
    }

    public static int solution(String str1, String str2) {

        int result = 0;

        String newStr1 = str1.replace(str2, "change");
        //System.out.println(newStr1);
        if(str1 == newStr1) result = 2;
        else result =1;

        return result;
    }
}

/*
문자열 str1, str2가 매개변수로 주어집니다.
str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 */


/* 참고답안
public int solution(String str1, String str2) {
        return (str1.contains(str2)? 1: 2);
    }
 */