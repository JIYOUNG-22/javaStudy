package com.dyong.programmers.level0;

public class 각도기 {
    public static void main(String[] args) {
        각도기 a = new 각도기();
        System.out.println(a.solution(180));
    }

    public int solution(int angle) {
        int result = (angle > 0 && angle < 90) ? 1 : (angle == 90) ? 2 : (angle > 90 && angle < 180) ? 3 : 4;
        return result;
    }
}
