package com.dyong.baekjoon.silver05;

import java.util.Scanner;

public class Baekjoon_1439 {
    public static void main(String[] args) {

        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.next().toCharArray();

        // 현재 상태(0인지 1인지) 저장할 state, 몇 번 바뀌었는지 저장할 count 변수 선언
        char state;
        double count = 0;

        // 문자열의 첫번째 숫자로 state 초기화
        state = input[0];

        // 0->1 , 1->0 바뀐 횟수 count
        for(int i = 1; i < input.length; i++) {
            if(state != input[i]) {
                count++;
                state = input[i];
            }
        }

        // 출력 -> 최소 횟수 : count/2
        // (count가 홀수인 경우 2로 나눠준 뒤 올림 처리)
        System.out.println((int) Math.ceil(count/2));

    }

}
