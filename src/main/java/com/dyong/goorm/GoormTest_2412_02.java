package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 플레이데이터 2024년 12월 코딩테스트(중급) [점수: 30/30] */
public class GoormTest_2412_02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 단어의 개수 N개
        int k = Integer.parseInt(st.nextToken());   // 단어의 위치 K

        List<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .toList();

//        List<String> sortedWords = words.stream()
//                .sorted(Comparator.comparingInt(String::length)
//                        .thenComparing(Comparator.naturalOrder()))
//                .collect(Collectors.toList());


        System.out.println(sortedWords.get(k-1));
    }
}
