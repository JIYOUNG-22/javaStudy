package com.dyong.baekjoon.silver03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.util.Arrays.sort;

public class Baekjoon_7795 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int n=0, m=0, x=0, y=0;
        int count=0;
        List<Integer> counts = new ArrayList<>();

        while(testcase != 0) {

            x=0; y=0; count=0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());    // A의 수
            m = Integer.parseInt(st.nextToken());    // B의 수

            // A의 크기 배열에 넣고 오름차순 정렬
            int[] arrayA = new int[n];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < n; i++) {
                arrayA[i] = Integer.parseInt(st.nextToken());
            }

            sort(arrayA);

            // B의 크기 배열에 넣고 오름차순 정렬
            int[] arrayB = new int[m];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < m; i++) {
                arrayB[i] = Integer.parseInt(st.nextToken());
            }

            sort(arrayB);

            // A가 B보다 큰 쌍의 개수 구하기
            while(x<n && y<m) {
                //System.out.println("x : " + x + "y : " + y);
                if(arrayA[x] > arrayB[y]) {
                    count++;
                    y++;
                } else {
                    x++;
                    y=0;
                }

                if(y==m) {
                    x++;
                    y=0;
                }
            }

            counts.add(count);

            testcase--;
        }

        for(int ans : counts){
            System.out.println(ans);
        }
    }

}
