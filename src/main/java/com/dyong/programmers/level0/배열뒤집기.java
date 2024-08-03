package com.dyong.programmers.level0;

import java.util.Arrays;

public class 배열뒤집기 {
    public static void main(String[] args) {
        배열뒤집기 abc = new 배열뒤집기();

        int[] iarr = {1,2,3,4,6,8,9,10};
        System.out.println("배열 뒤집기 : " + Arrays.toString(abc.solution(iarr)));
    }

    public int[] solution(int[] num_list) {

        int[] result = new int[num_list.length];

        for(int i=0; i<num_list.length; i++){
            result[i] = num_list[num_list.length-i-1];
        }

        return result;
    }
}
