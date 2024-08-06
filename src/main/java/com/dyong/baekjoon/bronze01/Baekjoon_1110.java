package com.dyong.baekjoon.bronze01;

import java.util.*;

public class Baekjoon_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주어진 수 : ");
        int num = scanner.nextInt();
        int initNum = num;

        int[] numArr = new int[2];
        int count = 0;

        while(true){
            if (num<=9){
                numArr[0] = 0;
                numArr[1] = num;
            } else {
                numArr[0] = num/10;
                numArr[1] = num%10;
            }

            // 각 자리의 숫자 더하기
            int addNum = numArr[0] + numArr[1];

            numArr[0] = numArr[1];
            numArr[1] = addNum%10;

            count++;
            num = (numArr[0]*10)+(numArr[1]);
            if(num==initNum) break;
        }
        System.out.println(count);
    }
}
