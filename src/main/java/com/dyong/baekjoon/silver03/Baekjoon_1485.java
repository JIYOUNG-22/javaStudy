package com.dyong.baekjoon.silver03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_1485 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());    // test case 개수


        List<Integer> dots = new ArrayList<>();
        long[] lengths = new long[6];

        while(testcase > 0) {
            for(int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                dots.add(Integer.parseInt(st.nextToken()));
                dots.add(Integer.parseInt(st.nextToken()));
            }

            lengths[0] = (long) (Math.pow((dots.get(0) - dots.get(2)), 2) + Math.pow((dots.get(1) - dots.get(3)), 2));
            lengths[1] = (long) (Math.pow((dots.get(0) - dots.get(4)), 2) + Math.pow((dots.get(1) - dots.get(5)), 2));
            lengths[2] = (long) (Math.pow((dots.get(0) - dots.get(6)), 2) + Math.pow((dots.get(1) - dots.get(7)), 2));
            lengths[3] = (long) (Math.pow((dots.get(4) - dots.get(6)), 2) + Math.pow((dots.get(5) - dots.get(7)), 2));
            lengths[4] = (long) (Math.pow((dots.get(2) - dots.get(6)), 2) + Math.pow((dots.get(3) - dots.get(7)), 2));
            lengths[5] = (long) (Math.pow((dots.get(2) - dots.get(4)), 2) + Math.pow((dots.get(3) - dots.get(5)), 2));
            Arrays.sort(lengths);

            if(lengths[0] == lengths[1] && lengths[0] == lengths[2] && lengths[0] == lengths[3]
                    && lengths[4] == 2 * lengths[0] && lengths[5] == 2 * lengths[0]) System.out.println(1);
            else System.out.println(0);

            dots.clear();
            testcase--;
        }

    }
}
