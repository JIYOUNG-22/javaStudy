package com.dyong.programmers.level0;

import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        int[] iarr = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(solution(iarr)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){
            answer[i] = 2 * numbers[i];
        }

        return answer;
    }
}
