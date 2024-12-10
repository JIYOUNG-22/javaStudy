package com.dyong.baekjoon.silver01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon_2531 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 접시의 수
        int d = Integer.parseInt(st.nextToken());   // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken());   // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken());   // 쿠폰 번호

        int[] dishes = new int[2*n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            dishes[i] = dishes[i+n] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> sushi = new HashSet<>();
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++){
                sushi.add(dishes[i+j]);
                //System.out.println("sushi : " + sushi + "result : " + result);
            }
            sushi.add(c);
            result = Math.max(result, sushi.size());
            sushi.clear();
            //System.out.println("sushi : " + sushi + "result : " + result);
        }

        System.out.println(result);

    }
}
