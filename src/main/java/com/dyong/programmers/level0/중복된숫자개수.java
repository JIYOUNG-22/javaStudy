package com.dyong.programmers.level0;

public class 중복된숫자개수 {
    public static void main(String[] args) {
        int[] iarr = {1, 1, 2, 3, 4, 5};
        System.out.println("중복된 숫자 개수 : " + solution(iarr, 1));
    }

    public static int solution(int[] array, int n) {
        int count = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == n) count++;
        }

        /* 방법 2
        for (int num : array) {
            if (num == n) count++;
        }
         */

        return count;
    }
}



/*
* 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
* array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */