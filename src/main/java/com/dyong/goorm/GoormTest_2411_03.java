package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 11월 코딩테스트(초급) [점수:40/40] */
public class GoormTest_2411_03 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // n개의 서로 다른 정수

        StringBuilder result = new StringBuilder();
        Stack<Integer> tempStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n>0) {
            int a = Integer.parseInt(st.nextToken());
            if(a%2==0) {
                result.append(a);
                result.append(" ");
            } else {
                tempStack.push(a);
            }
            n--;
        }

        while(!tempStack.empty()) {
            result.append(tempStack.pop());
            result.append(" ");
        }

        System.out.println(result);

    }
}
