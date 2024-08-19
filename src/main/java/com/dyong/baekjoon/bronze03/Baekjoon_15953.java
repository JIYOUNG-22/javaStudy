package com.dyong.baekjoon.bronze03;

import java.util.Scanner;

public class Baekjoon_15953 {
    public static void main(String[] args)  {

        // 첫 줄 - 가정한 경우의 수 입력 받아오기
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int price1;
        int price2;
        int[] price = new int[num];

        // 각 줄마다 입력 받아와서 상금 계산하기
        for(int i = 0; i < num; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            price1 = 0;
            price2 = 0;

            if(num1 == 0) price1 = 0;
            else if(num1 == 1) price1 = 5000000;
            else if(num1 <= 3) price1 = 3000000;
            else if(num1 <= 6) price1 = 2000000;
            else if(num1 <= 10) price1 = 500000;
            else if(num1 <= 15) price1 = 300000;
            else if(num1 <= 21) price1 = 100000;

            if(num2 == 0) price2 = 0;
            else if(num2 == 1) price2 = 5120000;
            else if(num2 <= 3) price2 = 2560000;
            else if(num2 <= 7) price2 = 1280000;
            else if(num2 <= 15) price2 = 640000;
            else if(num2 <= 31) price2 = 320000;

            price[i] = price1 + price2;

        }

        for(int j = 0; j < num; j++){
            System.out.println(price[j]);
        }

    }
}
