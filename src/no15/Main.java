package no15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        int n1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int n2 = scan2.nextInt();

        /*
        for(int i=n1; i<=n2; i++){
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
*/
        for (int i = 1; i <= 9; i++) {
            for(int j=n1; j<=n2; j++){
                System.out.print(j+"*"+i+"="+i*j);
            }
            System.out.println();
        }
    }
};