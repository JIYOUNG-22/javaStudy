package com.dyong.programmers.level0;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println("총 지불액 : " + solution(9,6));
    }

    public static int solution(int n, int k) {

        // 양꼬치 n인분, 음료수 k개
        // 양꼬치 10인분에 음료수 1개 서비스
        int bill = 0;

        bill = (12000 * n) + (2000 * (k-(n/10)));

        return bill;
    }
}
