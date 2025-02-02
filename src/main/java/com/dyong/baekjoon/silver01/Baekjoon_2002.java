package com.dyong.baekjoon.silver01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_2002 {

    static Queue<String> in = new ArrayDeque<>();
    static Queue<String> out = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cars = Integer.parseInt(br.readLine());

        createCarList(cars, in, br);
        createCarList(cars, out, br);

        HashSet<String> result = new HashSet<>();   // 추월한 차량번호 기록
        while(!in.isEmpty() && !out.isEmpty()) {
            if(in.peek().equals(out.peek())) {      // 들어온 차량번호 기준으로 계산
                in.poll();
                out.poll();
            } else {
                if(result.contains(in.peek())) {
                    in.poll();
                } else {
                    while (!out.isEmpty() && !in.peek().equals(out.peek())) {
                        result.add(out.poll());
                    }
                    in.poll();
                    out.poll();
                }
            }
        }

        System.out.println(result.size());
    }

    private static void createCarList(int n, Queue<String> queue, BufferedReader br) throws Exception {
        for(int i = 0; i < n; i++) {
            queue.add(br.readLine());
        }
    }
}
