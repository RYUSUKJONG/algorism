package no24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int score[] = new int[n];
        int sum=0; // 총 점수
        float s = 0;
        int cnt=0;  // 넘은 사람 수
        float result; // 결과

        for (int i = 0; i < n; i++) {
            score[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += score[i];
        }
        s = (float) sum/n;
        System.out.println("평균 : " +s);


        for (int i = 0; i < n; i++) {
            if(score[i]>=s){
                cnt++;
            }
        }
        result = (float) cnt/n*100;
        System.out.println("넘은 사람 수 : " +cnt);
        System.out.println(result+"%");

    }
};