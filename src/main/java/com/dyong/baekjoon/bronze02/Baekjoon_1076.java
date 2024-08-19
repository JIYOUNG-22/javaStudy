package com.dyong.baekjoon.bronze02;

import java.util.Scanner;

public class Baekjoon_1076 {

    public static void main(String[] args) {

        // 한 줄씩 입력받아서 배열에 넣기
        Scanner scanner = new Scanner(System.in);
        String[] colors = new String[3];

        colors[0] = scanner.nextLine();
        colors[1] = scanner.nextLine();
        colors[2] = scanner.nextLine();

        // StringBuilder에 저항값 저장
        StringBuilder resistor = new StringBuilder();

        // 저항 앞 2자리 (값)
        for(int i = 0; i < 2; i++) {
            switch(colors[i]) {
                case "black" : resistor.append("0"); break;
                case "brown" : resistor.append("1"); break;
                case "red" : resistor.append("2"); break;
                case "orange" : resistor.append("3"); break;
                case "yellow" : resistor.append("4"); break;
                case "green" : resistor.append("5"); break;
                case "blue" : resistor.append("6"); break;
                case "violet" : resistor.append("7"); break;
                case "grey" : resistor.append("8"); break;
                case "white" : resistor.append("9"); break;
            }
        }

        // 저항 마지막 자리 (곱)
        switch(colors[2]) {
            case "black" : resistor.append(""); break;
            case "brown" : resistor.append("0"); break;
            case "red" : resistor.append("00"); break;
            case "orange" : resistor.append("000"); break;
            case "yellow" : resistor.append("0000"); break;
            case "green" : resistor.append("00000"); break;
            case "blue" : resistor.append("000000"); break;
            case "violet" : resistor.append("0000000"); break;
            case "grey" : resistor.append("00000000"); break;
            case "white" : resistor.append("000000000"); break;
        }

        // 저항값 출력
        System.out.println(Long.parseLong(resistor.toString()));
    }
}
