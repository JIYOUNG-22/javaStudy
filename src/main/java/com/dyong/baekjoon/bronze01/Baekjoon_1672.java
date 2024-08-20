package com.dyong.baekjoon.bronze01;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1672 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 염기 서열의 길이
        scanner.nextLine();
        char[] dna = scanner.nextLine().toCharArray();  // 염기서열 배열에 넣기

        char[][] dnaMap = {{'A', 'C', 'A', 'G'},
                           {'C', 'G', 'T', 'A'},
                           {'A', 'T', 'C', 'G'},
                           {'G', 'A', 'G', 'T'}};

        while(N != 1) {

            for(int i = 0; i < dna.length; i++) {

            }
        }
    }
}




    // 메모리 초과
    /*public static void main(String[] args) {

        // 염기서열 입력 받아오기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 서열의 길이 N
        scanner.nextLine();

        // 입력 받은 염기서열을 StringBuilder에 넣기
        String str = scanner.nextLine();
        StringBuilder dna = new StringBuilder();
        dna.append(str);
        String temp;

        // dna의 길이가 1이 될때까지 해독 반복
        while(dna.length()!=1) {

            // temp에 dna 마지막 2자리 염기 저장
            temp = dna.substring(dna.length()-2,dna.length());

            // dna 마지막 2자리 삭제
            dna.delete(dna.length()-2,dna.length());

            // 두 개의 염기를 하나의 염기로 치환
            if(temp.equals("AA") || temp.equals("AC") || temp.equals("GT") || temp.equals("CA") || temp.equals("TG")) dna.append("A");
            else if(temp.equals("AT") || temp.equals("GG") || temp.equals("CT") || temp.equals("TA") || temp.equals("TC")) dna.append("G");
            else if(temp.equals("AG") || temp.equals("GA") || temp.equals("CC")) dna.append("C");
            else if(temp.equals("GC") || temp.equals("CG") || temp.equals("TT")) dna.append("T");

        }

        // 결과 출력
        System.out.println(dna);

    }*/
