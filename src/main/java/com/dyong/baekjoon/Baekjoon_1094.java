package com.dyong.baekjoon;

import java.util.Scanner;

public class Baekjoon_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 길이 : ");
        int x = scanner.nextInt();
        int count = 0;

    int[] iarr = {64,32,16,8,4,2,1};

    for(int i=0; i<7; i++){
        if(x / iarr[i] == 1){
            count++;
            if(x % iarr[i] == 0) break;
            x %= iarr[i];
        }
    }
        System.out.println(count);
    }
}
