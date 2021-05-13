package no3;

//가장 많이 출연한 수

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int[] inputnum = new int[10];
        int[] cnt = new int[10];  //횟수를 담는 arr

        for(int i=0; i<10; i++){
            inputnum[i] = scan.nextInt();
        }

        for(int i=0; i<10; i++){
            cnt[inputnum[i]]++;
        }

        int modeNum = 0;  //최빈수
        int modeCnt = 0;  //최빈수가 나온 횟수
        for(int i=0; i<10; i++){
            if(modeCnt < cnt[i]){
                modeCnt = cnt[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수 : "+modeCnt+"Cnt : "+modeNum);


    }
};