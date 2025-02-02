package com.dyong.baekjoon.gold03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_17299 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 수열 A의 크기 (1 <= n <= 1,000,000)

        // Ai가 수열 A에서 등장한 횟수 기록하기 위해 map 선언
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] input = new int[n];   // 입력 받은 수열 A
        int[] arrayF = new int[n];  // 등장한 횟수 기록한 수열 F(A)
        int temp;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            temp = Integer.parseInt(st.nextToken());
            input[i] = temp;

            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        for(int i = 0; i < n; i++) {
            arrayF[i] = map.get(input[i]);
        }

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];  // 출력 할 오등큰수 배열 NGF(i)

        for(int i = 0; i < n; i++) {
            result[i] = -1; // -1로 초기화
        }

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arrayF[stack.peek()] < arrayF[i]) {
                result[stack.pop()] = input[i];
            }
            stack.push(i);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for(int ngf : result) {
            sb.append(ngf).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
