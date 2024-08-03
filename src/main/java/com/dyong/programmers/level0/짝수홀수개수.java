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
