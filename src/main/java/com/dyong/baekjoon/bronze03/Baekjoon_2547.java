package com.dyong.baekjoon.bronze03;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_2547 {

    public static void main(String[] args) {

        // 입력 받아오기
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 testCases
        int testCases = scanner.nextInt();
        scanner.nextLine();
        scanner.nextLine();

        // 사탕의 개수를 받아올 BigInteger 배열 선언
        BigInteger[] bigIntegers = new BigInteger[testCases];

        // 결과(YES or NO)를 받아올 result 배열 선언
        String[] result = new String[testCases];

        for(int i = 0; i < testCases; i++) {

            // BigInteger 배열 0으로 초기화
            bigIntegers[i] = BigInteger.ZERO;

            // 각 테스트 케이스의 학생 수 check
            int check = scanner.nextInt();

            // 학생 수 만큼 반복하면서 사탕 갯수 더하기
            for(int j = 0; j < check; j++) {
                bigIntegers[i] = bigIntegers[i].add(scanner.nextBigInteger());
            }

            // 총 사탕 갯수를 학생 수로 나눈 나머지가 0이면 "YES", 0이 아니면 "NO"를 저장
            result[i] = bigIntegers[i].mod(BigInteger.valueOf(check)).equals(BigInteger.ZERO) ? "YES" : "NO";

            // 다음 테스트 케이스를 받기 위해 개행 두번 받아줌
            // 마지막 테스트 케이스의 경우 개행을 받아 줄 필요 없으므로 break
            if(i==testCases-1) break;
            scanner.nextLine();
            scanner.nextLine();
        }

        // 결과 출력
        for(String s : result) {
            System.out.println(s);
        }

    }

}
