package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 11월 코딩테스트(초급) [점수:30/30] */
public class GoormTest_2411_02 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());    // 집의 수
        int k = Integer.parseInt(st.nextToken());    // 신고의 수

        Map<Integer, Integer> reports = new HashMap<>();
        int police = 0;

        while(k>0) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());   // 신고한 집의 번호
            int e = Integer.parseInt(st.nextToken());   // 신고 당한 집의 번호

            if(reports.containsKey(e)) {
                if(reports.get(e) == s) ;
                else {
                    police++;
                    reports.remove(e);
                }
            } else {
                reports.put(e, s);
            }

            k--;
        }

        System.out.println(police);

    }
}
