package com.dyong.Programmers.Level0;

/*
정수 num1과 num2가 주어질 때,
num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
*/

public class 두수의차 {
    public static int solution(int num1, int num2) {
        int answer = num1 -num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("두 수의 차(2,3) : "+solution(2,3));
        System.out.println("두 수의 차(100,2) : "+solution(100,2));
    }
}
