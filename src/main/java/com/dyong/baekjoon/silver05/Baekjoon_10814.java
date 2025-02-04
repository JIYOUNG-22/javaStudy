package com.dyong.baekjoon.silver05;

import java.io.*;
import java.util.*;

public class Baekjoon_10814 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());	// n명의 회원

        StringTokenizer st;
        List<Member> members = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(name, age, i));
        }

        members.stream()
                .sorted(Comparator.comparing(Member::getAge)    // 나이순 정렬
                        .thenComparing((Member::getSeq)))       // 나이가 같다면 가입순번 정렬
                .forEach(a -> System.out.println(a.getAge() + " " + a.getName()));  // 출력
    }

    static class Member{
        String name;    // 이름
        int age;        // 나이
        int seq;        // 가입 순번

        public Member(String name, int age, int seq) {
            this.name = name;
            this.age = age;
            this.seq = seq;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSeq() {
            return seq;
        }

    }
}
