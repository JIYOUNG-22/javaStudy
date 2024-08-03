package com.dyong.programmers.level0;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        int[] iarr = {1,3,5,7};

        System.out.println("짝수, 홀수 개수 : " + Arrays.toString(solution(iarr)));
    }

    public static int[] solution(int[] num_list) {
        int[] arr = new int[2];
        int oddNum = 0, evenNum = 0;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                evenNum++;
                continue;
            } oddNum++;
        }

        arr[0] = evenNum;
        arr[1] = oddNum;

        return arr;
    }
}

/* 다른 사람의 풀이

 public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
        // [index] : index 값이 0,1만 나오니까 위처럼 쓰는 것도 가능

        return answer;
    }

 */