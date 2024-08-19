package com.dyong.baekjoon.bronze01;

import java.util.Scanner;

public class Baekjoon_1333 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // N개의 노래
        int L = scanner.nextInt();  // L초의 노래
        int D = scanner.nextInt();  // D초마다 전화

        int phone = 0;

        // 노래 N곡이 다 끝나기 전에 전화벨을 듣는 경우
        for(int i = 0; i < N-1; i++){
            if(phone!=0) break;

            for(int j = 0; j <= (N*L+5*(N-1))/(D); j++) {
                if (D * (j + 1) >= L * (i + 1) + 5 * i && D * (j + 1) < (L + 5) * (i + 1)) {
                    phone = D * (j + 1);
                    break;
                }
            }

        }

        // 노래 N곡이 다 끝난 후 전화벨을 듣는 경우
        double temp = Math.ceil((L*N+5*(N-1))/ (double) D);
        if(phone==0) {phone = D* (int) temp;}

        // 결과 출력
        System.out.println(phone);
    }
}
