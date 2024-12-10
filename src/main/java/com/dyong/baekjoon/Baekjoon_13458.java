package com.dyong.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_13458 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 시험장 개수

        int[] arrA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken()); // 각 시험장의 응시자 수
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());   // 총감독관이 감시할 수 있는 응시자 수
        int c = Integer.parseInt(st.nextToken());   // 부감독관이 감시할 수 있는 응시자 수

//        System.out.println("시험장 개수 : " + n + " 총감독관 감시 수 : " + b + " 부감독관 감시 수 : " + c);
//        System.out.println("각 시험장 응시자 수" + Arrays.toString(arrA));

        long count = n;
        for(int i = 0; i < n; i++) {
            if(arrA[i] -b >= 0) {
                arrA[i] = (int) Math.ceil((double) (arrA[i] - b) / c);
                count += arrA[i];
            }
        }

        //System.out.println("각 시험장 응시자 수" + Arrays.toString(arrA));
        System.out.println(count);
    }
}
