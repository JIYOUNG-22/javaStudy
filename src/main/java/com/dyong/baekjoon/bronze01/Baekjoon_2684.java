package com.dyong.baekjoon.bronze01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2684 {
    public static void main(String[] args) throws IOException {

        // 입력 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] coin = new String[num];
        for(int i = 0; i < num; i++){
            coin[i] = br.readLine();
        }

        // 3-동전수열 횟수 카운트
        String[] combo3 = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
        int[][] counts = new int[num][8];

        for(int k=0; k < num; k++) {
            for (int i = 0; i < 38; i++) {
                for (int j = 0; j < 8; j++) {
                    if (coin[k].substring(i, i + 3).equals(combo3[j])) counts[k][j]++;
                }
            }
        }

        // 출력
        for(int i = 0; i < num; i++) {
            for(int count : counts[i]) {
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }
}
