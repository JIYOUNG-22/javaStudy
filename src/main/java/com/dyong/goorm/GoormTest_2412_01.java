package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/* 플레이데이터 2024년 12월 코딩테스트(중급) [점수: 0/30] */
public class GoormTest_2412_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] inputArr = br.readLine().toCharArray();

        Queue<Integer> open = new LinkedList<>();
        Queue<Integer> close = new LinkedList<>();
        int result = 0;

        for(int i = 0; i < n; i++) {

            if(inputArr[i] == '(') {
                open.add(i);
            } else if(inputArr[i] == ')') {

                result += open.poll();
            } else {
                result++;
            }


        }
    }
}
