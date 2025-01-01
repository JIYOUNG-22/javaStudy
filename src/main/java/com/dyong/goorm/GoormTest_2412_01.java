package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/* 플레이데이터 2024년 12월 코딩테스트(중급) [점수: 0/30] -> 수정 완료 */
public class GoormTest_2412_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] inputArr = br.readLine().toCharArray();

        Stack<String> input = new Stack<>();
        Stack<String> temp = new Stack<>();
        StringBuilder code = new StringBuilder();

        for(int i = 0; i < n; i++) {

            if(inputArr[i]=='(') {
                input.push("(");
            } else if(inputArr[i]==')') {
                while(!input.peek().equals("(")){
                    temp.push(input.pop());
                }
                input.pop();
                while(!temp.isEmpty()) {
                    code.append(temp.peek());
                    input.push(temp.pop());
                }
            } else {
                input.push(String.valueOf(inputArr[i]));
                code.append(inputArr[i]);
            }

        }
        //System.out.println(code);
        System.out.println(code.length());
    }
}
