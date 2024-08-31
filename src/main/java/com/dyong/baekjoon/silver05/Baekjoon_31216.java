package com.dyong.baekjoon.silver05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_31216 {

    static ArrayList<Integer> prime = new ArrayList<>();
    static boolean count = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());      // 테스트 케이스 개수 T
        int[] answers = new int[T];     // 테스트 케이스 마다의 정답(슈퍼소수)을 저장할 배열

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());      // 입력 받은 n (n번째 슈퍼소수를 구하라)
            int temp = solution(n);         // n번째 소수 구하기 (temp : n번째 소수의 값)
            answers[i] = solution(temp);    // temp번째 소수 구하기 (= n번째 슈퍼소수)
        }

        // 출력
        for(int answer : answers) {
            System.out.println(answer);
        }
    }

    /* k번째 소수를 구하는 메소드 */
    public static int solution(int k) {

        // list에 아직 아무 값도 입력되지 않았을 때
        if(prime.isEmpty()) {
            for (int i = 2; i < Integer.MAX_VALUE; i++) {
                count = false;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count = true;
                        break;
                    }
                }

                if (!count) prime.add(i);
                if (prime.size() == k) break;
            }
        } else if(prime.size() < k) {   // 저장된 소수 갯수가 원하는 갯수보다 작을 때

            for (int i = prime.get(prime.size()-1)+1; i < Integer.MAX_VALUE; i++) {
                count = false;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count = true;
                        break;
                    }
                }

                if (!count) prime.add(i);
                if (prime.size() == k) break;
            }
        }

        // k번째 소수 리턴
        return prime.get(k-1);
    }
}
