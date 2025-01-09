package com.dyong.baekjoon.silver03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Character.*;

public class Baekjoon_3613 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder result = new StringBuilder();
        boolean isError = false;

        // 초기 Error 검사
        if(!isLowerCase(input.charAt(0)) || input.charAt(input.length()-1) == '_') {
            System.out.println("Error!");
            return;
        }

        // C언어인데 대문자가 나오면 Error 이므로 C언어인지 확인하는 isC 체크
        boolean isC = false;
        if(input.contains("_")) isC = true;

        for(int i = 0; i < input.length(); i++) {
            if(isUpperCase(input.charAt(i))) {  // 1. 대문자인 경우
                if(isC) {
                    isError = true;
                    break;
                }
                result.append("_").append(toLowerCase(input.charAt(i)));
            } else if(isLowerCase(input.charAt(i))) {   // 2. 소문자인 경우
                result.append(input.charAt(i));
            } else if(input.charAt(i)=='_') {   // 3. '_'인 경우
                if(isLowerCase(input.charAt(i+1))){
                    result.append(toUpperCase(input.charAt(++i)));
                } else {    // '_' 다음에 오는 문자가 소문자가 아닌 경우 Error
                    isError = true;
                    break;
                }
            } else {    // 4.  알파벳이나 '_'가 아닌 경우
                isError = true;
                break;
            }
        }

        System.out.println(isError? "Error!" : result);
    }
}
