package com.dyong.baekjoon.bronze02;

import java.util.Scanner;

public class Baekjoon_1712 {
    public static void main(String[] args) {

        // 고정비용, 가변비용, 물건가격 입력 받기
        Scanner scanner = new Scanner(System.in);
        int fixedCost = scanner.nextInt();
        int variableCost = scanner.nextInt();
        int productPrice = scanner.nextInt();

        // 손익분기점 존재하는 경우, 존재하지 않는 경우 나눠서 판매량 계산
        if (productPrice > variableCost) {
            System.out.println((fixedCost / (productPrice - variableCost)) + 1);
        } else {System.out.println("-1");}

    }
}
