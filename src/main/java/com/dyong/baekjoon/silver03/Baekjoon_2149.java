package com.dyong.baekjoon.silver03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_2149 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] key = br.readLine().toCharArray();
        char[] secret = br.readLine().toCharArray();

        char[] keyCopy = key.clone();
        int rotate = secret.length / key.length;
        Map<Integer, Queue<Character>> brain = new HashMap<>();

        Arrays.sort(key);

        // 정렬된 key를 기준으로 순서 index 생성
        Map<Character, Queue<Integer>> index = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            index.putIfAbsent(key[i], new LinkedList<>());
            index.get(key[i]).add(i);
        }
        //System.out.println(index);

        for (int i = 0; i < key.length; i++) {
            Queue<Character> temp = new LinkedList<>();
            for(int j = 0; j < rotate; j++) {
                temp.offer(secret[j + (i*rotate)]);
            }
            brain.put(i, new LinkedList<>(temp));
        }
        //System.out.println(brain);

        StringBuilder result = new StringBuilder();
        int[] keyIndex = new int[key.length];
        for(int i = 0; i < key.length; i++) {
            keyIndex[i] = index.get(keyCopy[i]).poll();
        }
        //System.out.println(Arrays.toString(keyIndex));

        for(int j = 0; j < rotate; j++) {
            for(int i = 0; i < key.length; i++) {
                result.append(brain.get(keyIndex[i]).poll());
            }
        }

        System.out.println(result);
    }

}
