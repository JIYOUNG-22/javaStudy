package com.dyong.baekjoon.gold05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Baekjoon_2230 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        int x=0, y=1;
        int minDiff = Integer.MAX_VALUE;    // 최소 차이를 큰 값으로 초기화

        while(x<=y && y<n) {
            //System.out.println("x : "+x+", y : "+y);
            int diff = arr[y] - arr[x];

            if(diff >= m) {
                minDiff = Math.min(minDiff, diff);
                x++;
            } else {
                y++;
            }

            if(minDiff == m) {
                break;
            }
        }

        System.out.println(minDiff);
    }

}

