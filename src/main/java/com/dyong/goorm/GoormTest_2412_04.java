package com.dyong.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 플레이데이터 2024년 12월 코딩테스트(초급) [점수: 30/30] */
public class GoormTest_2412_04 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int knee = Integer.parseInt(br.readLine());

        int[][] scarCoordinate = new int[knee][knee];
        for(int i = 0; i < knee; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < knee; j++) {
                scarCoordinate[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int xMin=0, xMax=knee;
        int yMin=0, yMax=knee;
        for(int i = 0; i<knee; i++) {
            for(int j = 0; j < knee; j++) {
                if(scarCoordinate[i][j] == 1) {
                    xMin = i;
                    break;
                }
            }
        }
        for(int i = knee-1; i>=0; i--) {
            for(int j = 0; j < knee; j++) {
                if(scarCoordinate[i][j] == 1) {
                    xMax = i;
                    break;
                }
            }
        }

        for(int i = 0; i<knee; i++) {
            for(int j = 0; j < knee; j++) {
                if(scarCoordinate[j][i] == 1) {
                    yMin = i;
                    break;
                }
            }
        }
        for(int i = knee-1; i>=0; i--) {
            for(int j = 0; j < knee; j++) {
                if(scarCoordinate[j][i] == 1) {
                    yMax = i;
                    break;
                }
            }
        }

        System.out.println((xMax-xMin-1)*(yMax-yMin-1));
    }
}
