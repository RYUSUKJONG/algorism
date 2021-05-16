package no30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        boolean flag = true;

        for (int i = 1; i <= num; i++) {

            if(i==num){
                System.out.print(i);
                break;
            }

            if(flag){
                flag = !flag;
                System.out.print(i+"+");
            }
            else if(!flag){
                flag = !flag;
                System.out.print(i+"-");
            }
        }


/*        int num = 9;
        int res = 1;

        for (int j = 2; j <= num; j++) {
            if(j%2==1){
                res -= j;
            }
            else if (j%2==0){
                res +=j;
            }
        }
        System.out.println(res);*/

    }
};