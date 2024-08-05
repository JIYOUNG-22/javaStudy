package com.dyong.programmers.level0;

/*
* 정수 배열 numbers가 매개변수로 주어집니다.
* numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */

public class 배열의평균값 {

    public static double solution(int[] numbers) {
        double answer = 0;
        double value = 0;

        for (int i = 0; i < numbers.length; i++) {
            value += numbers[i];
        }
        answer = value / numbers.length;
        return answer;
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("배열의 평균값 : " + solution(intArray));
    }


}

