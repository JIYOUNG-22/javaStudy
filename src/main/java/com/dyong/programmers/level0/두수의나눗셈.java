package com.dyong.programmers.level0;

/*
* 정수 num1과 num2가 매개변수로 주어질 때,
* num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
*/

public class 두수의나눗셈 {

    public static int solution(int num1, int num2) {
        int answer = 0;
        double result = ((double) num1 / num2) * 1000;
        answer = (int) result;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("두 수의 나눗셈(3, 2) : " + solution(3, 2));
        System.out.println("두 수의 나눗셈(7, 3) : " + solution(7, 3));
        System.out.println("두 수의 나눗셈(1, 16) : " + solution(1, 16));
    }
}
