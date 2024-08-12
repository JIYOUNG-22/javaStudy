package com.dyong.baekjoon.bronze01;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("단어를 입력하세요 : ");
        String word = scanner.nextLine();
        int[] alparr = new int[27];

        // 알파벳 갯수 카운트
        for(int i = 0; i < word.length(); i++) {
            for(int j = 65; j <= 90; j++) {
                if((int)word.charAt(i) == j || (int)word.charAt(i) == (j+32)){
                    alparr[j-65]++;
                }
            }
        }

        //System.out.println(Arrays.toString(alparr));

        // 가장 많이 사용된 알파벳 찾기

        int maxIndex = 0, maxValue = 0;

        for(int i=0; i<26; i++){
            if(alparr[i] > alparr[maxIndex]){
                maxIndex = i;
                maxValue = alparr[i];
            }
        }

        //System.out.println("maxIndex: " + maxIndex + " maxValue: " + maxValue);

        int count = 0;
        for(int i=0; i<26; i++){
         if(alparr[i] == alparr[maxIndex]) count++;
        }

        if(count ==1) System.out.println((char) (maxIndex+65));
        else System.out.println("?");

    }
}
