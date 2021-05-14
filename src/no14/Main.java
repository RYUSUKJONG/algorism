package no14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int input = scan.nextInt();

        int input = 1231231230;

        int[] arr = new int[10];

        if(input==0){
            arr[0]++;
        }
        /*
        while(input>0){
            int k;
            k = input % 10;
            for (int i = 0; i < 10; i++) {
                if(k==i){
                    arr[i]++;
                }
            }
            input /= 10;
            k = 0;
        }
*/
        while (input > 0){
            arr[input % 10]++;
            input /= 10;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i+" : "+arr[i]);
        }
    }
};