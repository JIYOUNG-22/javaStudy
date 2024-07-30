package com.dyong.Programmers.Level0;

/*
정수 num1, num2가 매개변수로 주어질 때,
num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
 */

public class 몫구하기 {

    public static int solution(int num1, int num2) {
        int answer = 0;
        if(num2 != 0) {
            answer = num1 / num2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("몫 구하기(10,5) : " + solution(10,5));
        System.out.println("몫 구하기(7,2) : " + solution(7,2));
    }
}
