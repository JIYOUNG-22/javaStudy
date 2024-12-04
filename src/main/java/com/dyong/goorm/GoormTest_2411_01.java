package com.dyong.goorm;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 11월 코딩테스트(초급) [점수:30/30] */
public class GoormTest_2411_01 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 정수 카드의 개수 n

        Set<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int c = Integer.parseInt(st.nextToken());
            if(cards.contains(c)) {
                cards.remove(c);
            } else {
                cards.add(c);
            }
        }

        if (!cards.isEmpty()) {
            System.out.println(cards.iterator().next());
        }

    }

}
