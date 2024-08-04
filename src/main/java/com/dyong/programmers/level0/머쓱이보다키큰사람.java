package com.dyong.programmers.level0;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        머쓱이보다키큰사람  abc = new 머쓱이보다키큰사람();
        int[] iarr = {149, 180, 192, 170};
        System.out.println("머쓱이보다 키 큰 사람 : " + abc.solution(iarr, 167));
    }

    public int solution(int[] array, int height) {
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if (height < array[i]) count++;
        }

        return count;
    }
}

/*
머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */

/* 참고풀이
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i: array){
            answer += (i>height) ? 1 : 0;
        }
        return answer;
    }
}


 */