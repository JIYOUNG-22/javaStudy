package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 12월 코딩테스트(초급) [점수: 30/30] */
public class GoormTest_2412_05 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        int[] members = new int[10];

        while(people > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String classLevel = st.nextToken();
            int vote = Integer.parseInt(st.nextToken());

            if(classLevel.equals("A")) {
                members[vote] += 3;
            } else if(classLevel.equals("B")) {
                members[vote] += 2;
            } else {
                members[vote] += 1;
            }
            people--;
        }

        int result = 0;
        for(int i=0; i < 10; i++) {
            result = Math.max(result, members[i]);
        }

        for(int j=0; j<10; j++) {
            if(members[j] == result) System.out.println(j);
        }
    }
}
