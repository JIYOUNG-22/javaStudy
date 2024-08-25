package com.dyong.baekjoon.bronze02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2966 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 필기시험의 문제의 수 N
        char[] answer = br.readLine().toCharArray();

        char[] a = {'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C'};
        char[] b = {'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C'};
        char[] c = {'C', 'C', 'A', 'A', 'B', 'B', 'C', 'C', 'A', 'A', 'B', 'B'};

        // a,b,c 사람 각각 맞은 문제의 갯수 세기
        int countA = 0, countB = 0, countC = 0;

        for(int i = 0; i < N; i++) {

            if(answer[i] == a[i%12]) countA++;
            if(answer[i] == b[i%12]) countB++;
            if(answer[i] == c[i%12]) countC++;

        }

        StringBuilder sb = new StringBuilder();

        // 가장 많은 문제를 맞춘 사람
        if(countA == countB && countA == countC) {
            sb.append(countA).append("\n").append("Adrian").append("\n").append("Bruno").append("\n").append("Goran");
        } else if(countA == countB && countA > countC) {
            sb.append(countA).append("\n").append("Adrian").append("\n").append("Bruno");
        } else if(countA == countC && countA > countB) {
            sb.append(countA).append("\n").append("Adrian").append("\n").append("Goran");
        } else if(countB == countC && countB > countA) {
            sb.append(countB).append("\n").append("Bruno").append("\n").append("Goran");
        } else if(countA > countB && countA > countC) {
            sb.append(countA).append("\n").append("Adrian");
        } else if(countB > countA && countB > countC) {
            sb.append(countB).append("\n").append("Bruno");
        } else {
            sb.append(countC).append("\n").append("Goran");
        }

        // 출력
        System.out.println(sb);

    }
}
