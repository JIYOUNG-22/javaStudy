package com.dyong.baekjoon.gold02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_7453 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arrA = new long[n];
        long[] arrB = new long[n];
        long[] arrC = new long[n];
        long[] arrD = new long[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrA[i] = Long.parseLong(st.nextToken());
            arrB[i] = Long.parseLong(st.nextToken());
            arrC[i] = Long.parseLong(st.nextToken());
            arrD[i] = Long.parseLong(st.nextToken());
        }

        long[] sumAB = new long[n*n];
        long[] sumCD = new long[n*n];
        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sumAB[index] = arrA[i] + arrB[j];
                sumCD[index++] = arrC[i] + arrD[j];
            }
        }
        Arrays.sort(sumAB);
        Arrays.sort(sumCD);

        long count = 0;
        int left = 0, right = n*n-1;
        while(left < n*n && right >= 0) {

            if(sumAB[left] + sumCD[right] < 0) left++;
            else if(sumAB[left] + sumCD[right] > 0) right--;
            else {
                long leftCount=1, rightCount=1;
                while(left + 1 < n*n && sumAB[left]==sumAB[left+1]){
                    leftCount++;
                    left++;
                }
                while(right > 0 && sumCD[right]==sumCD[right-1]){
                    rightCount++;
                    right--;
                }
                count += leftCount * rightCount;
                left++;
            }
        }

        System.out.println(count);
    }

}
