package no31;

import java.util.Scanner;

public class Main {

    //재귀함수 -> 무한루프 방지를 위해 탈출 조건을 작성하여야 함

    public static int calFact(int i){

        if(i==1)
            return i;
        return i*calFact(i-1);
        
    }




    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        int ans = 0;
        ans = calFact(input);


        System.out.println(ans);
    }
};