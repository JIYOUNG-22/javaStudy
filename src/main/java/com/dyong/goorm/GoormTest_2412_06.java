package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 12월 코딩테스트(초급) [점수: 40/40] */
public class GoormTest_2412_06 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        while(testcase > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a % b == 0) System.out.println("YES");
            else System.out.println("NO");

            testcase--;
        }
    }
}
