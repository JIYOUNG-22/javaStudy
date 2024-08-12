package com.dyong.baekjoon.bronze01;

import java.util.Scanner;

public class Baekjoon_1236 {
    public static void main(String[] args) {

        // 성의 세로 크기 N, 가로 크기 M, 성의 상태 받아오기
        Scanner scanner = new Scanner(System.in);
        String rowN = scanner.next();
        String columnM = scanner.nextLine();

        String[] floors = new String[Integer.parseInt(rowN)];
        for(int i = 0; i < Integer.parseInt(rowN) ; i++){
             floors[i] = scanner.next();
        }

        // 성의 상태 출력
        /*System.out.println("행 : " + rowN + "열 : " + columnM);
        for(int i = 0; i < Integer.parseInt(rowN) ; i++){
            System.out.println(floors[i]);
        }*/

        // 행 단위 경비원 없는 줄 갯수 확인
        int temp = 0;
        int Ncount= 0, Mcount = 0;

        for(int i = 0; i < Integer.parseInt(rowN); i++){
            temp = 0;
            for(int j = 0; j < floors[i].length(); j++){
                if(floors[i].charAt(j) == 'X') temp++;
            }
            if(temp ==0) Ncount++;
        }

        //System.out.println(Ncount);

        // 열 단위 경비원 없는 열 갯수 확인
        for(int i = 0; i < floors[0].length(); i++){
            temp = 0;
            for(int j = 0; j < Integer.parseInt(rowN); j++){
                if(floors[j].charAt(i) == 'X') temp++;
            }
            if(temp ==0) Mcount++;
        }

        //System.out.println(Mcount);

        // 추가해야 하는 경비원의 최솟값
        System.out.println(Math.max(Ncount, Mcount));

    }
}
