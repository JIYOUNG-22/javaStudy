package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 플레이데이터 2024년 12월 코딩테스트(중급) [점수: 40/40] */
public class GoormTest_2412_03 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long x = 0;
        long a = 2;
        while(x <= 0 || x%2 == 0) {

            x = ((2*a) * (2*a + 1)) / 4 - (2 * (n + 1)) / 4;
            a++;
//            System.out.println("x : " + x + " a : " + a);
        }

        System.out.println(x);
    }

}
