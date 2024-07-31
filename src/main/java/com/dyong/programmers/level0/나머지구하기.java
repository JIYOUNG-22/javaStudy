package com.dyong.programmers.level0;

/*
정수 num1, num2가 매개변수로 주어질 때,
num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요
 */

public class 나머지구하기 {

    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("나머지 구하기(3,2) : "+solution(3, 2));
        System.out.println("나머지 구하기(10,5) : "+solution(10, 5));

    }
}
