package com.dyong.baekjoon.bronze03;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1247 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt(); // 첫번째 테스트 정수 개수
        BigInteger sum1 = new BigInteger("0");
        for(int i = 0; i < N1; i++) {
            sum1 = sum1.add(scanner.nextBigInteger());
        }

        int N2 = scanner.nextInt(); // 두번째 테스트 정수 개수
        BigInteger sum2 = new BigInteger("0");
        for(int i = 0; i < N2; i++) {
            sum2 = sum2.add(scanner.nextBigInteger());
        }

        int N3 = scanner.nextInt(); // 세번째 테스트 정수 개수
        BigInteger sum3 = new BigInteger("0");
        for(int i = 0; i < N3; i++) {
           sum3 = sum3.add(scanner.nextBigInteger());
        }

        // 합의 부호 출력
        BigInteger compareNum = new BigInteger("0");
        /* compareTo() : 0과 같으면 0 출력, 0 보다 작으면 음수 출력, 0 보다 크면 양수 출력*/
        System.out.println(sum1.compareTo(compareNum) == 0 ? "0" : sum1.compareTo(compareNum) > 0 ? "+" : "-");
        System.out.println(sum2.compareTo(compareNum) == 0 ? "0" : sum2.compareTo(compareNum) > 0 ? "+" : "-");
        System.out.println(sum3.compareTo(compareNum) == 0 ? "0" : sum3.compareTo(compareNum) > 0 ? "+" : "-");

    }

}
