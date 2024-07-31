package com.dyong.programmers.level0;

    /*
    * 정수 num1과 num2가 매개변수로 주어집니다.
    * 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성해주세요.
    */

public class 숫자비교하기 {

    public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1==num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("숫자 비교하기(2,3) : "+solution(2,3));
        System.out.println("숫자 비교하기(11,11) : "+solution(11,11));
        System.out.println("숫자 비교하기(7,99) : "+solution(7,99));
    }

}

