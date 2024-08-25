package com.dyong.baekjoon.silver04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2847 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());      // 레벨의 수 N
        List<Integer> score  = new ArrayList<>();

        // 각 레벨을 클리어하면 얻는 점수 List에 넣기
        for(int i = 0; i < N; i++) {
            score.add(Integer.parseInt(br.readLine()));
        }

        // 앞 레벨 점수가 뒷 레벨 점수보다 작아질 때까지 반복하며 1씩 점수 감소
        // 점수 감소한 횟수 count
        int count = 0;
        for(int j = score.size()-2; j >= 0; j--) {

            while(score.get(j) >= score.get(j+1)) {
                score.set(j, score.get(j)-1);
                count++;
            }

        }

        // 출력
        System.out.println(count);
    }
}
