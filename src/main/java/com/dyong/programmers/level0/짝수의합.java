package com.dyong.programmers.level0;

public class 짝수의합 {
    public static void main(String[] args) {
        System.out.println("n 이하의 짝수의 합 : " + solution(10));
    }

    public static int solution(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        return sum;
    }
}
