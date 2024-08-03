package com.dyong.programmers.level0;

public class 배열의평균값 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(solution(arr1));;
        System.out.println(solution(arr2));;
    }

    public static double solution(int[] numbers) {

        int sum = 0;
        double avg = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        avg = (double) sum / numbers.length;

        return avg;

    }
}
