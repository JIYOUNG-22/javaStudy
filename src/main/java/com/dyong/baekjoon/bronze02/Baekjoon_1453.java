package com.dyong.baekjoon.bronze02;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baekjoon_1453 {
    public static void main(String[] args) {

        // 손님의 수(num), 각 손님이 앉고 싶어하는 자리(wanted) 입력 받아오기
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        StringTokenizer wanted = new StringTokenizer(str);

        // 중복 제거를 위해 Set 사용
        Set<String> seats = new TreeSet<>();

        while(wanted.hasMoreTokens()) {
            seats.add(wanted.nextToken());
        }

        // 거절당한 손님의 수 : 방문한 손님 수 - 손님들이 원했던 자리(중복 제거)의 갯수
        System.out.println(num - seats.size());

    }
}
