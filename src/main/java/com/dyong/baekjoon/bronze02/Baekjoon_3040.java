package com.dyong.baekjoon.bronze02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_3040 {
    public static void main(String[] args) {

        // 아홉 난쟁이 모자 숫자 입력 받을 ArrayList 선언
        List<Integer> dwarfs = new ArrayList<>();

        // 아홉 난쟁이 모자 숫자 입력 받기, 숫자의 합 구하기
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 9; i++) {
            dwarfs.add(scanner.nextInt());
            sum += dwarfs.get(i);
        }

        // 차이 (전체 합 - 100) 구하기
        int diff = sum - 100;

        // 리스트 젤 끝 번호부터 (차이 - 값)한 값이 리스트에 있는지 확인 후
        // 일치하는 값이 있으면 두 개 값 리스트에서 제거
        for(int j = 8; j > 0; j--) {
            if(dwarfs.contains(diff - dwarfs.get(j))) {
                int temp = dwarfs.indexOf(diff - dwarfs.get(j));
                dwarfs.remove(j);
                dwarfs.remove(temp);
                break;
            }
        }

        for(int dwarf : dwarfs) {
            System.out.println(dwarf);
        }
    }
}
