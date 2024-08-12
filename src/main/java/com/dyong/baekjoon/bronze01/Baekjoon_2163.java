package com.dyong.baekjoon.bronze01;

import java.io.*;
import java.util.Scanner;

public class Baekjoon_2163 {
    public static void main(String[] args) throws Exception {
        /* 방법 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("초콜렛 크기 입력 : ");
        String[] choco = br.readLine().split(" ");
        //System.out.println(choco[0] + " " + choco[1]);

        System.out.println((Integer.parseInt(choco[0])-1) + (Integer.parseInt(choco[0]))*(Integer.parseInt(choco[1])-1));
        */

        // 방법 2
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(n*m -1);

    }
}
