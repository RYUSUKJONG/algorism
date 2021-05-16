package no32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int n1, n2;
            Scanner scan = new Scanner(System.in);
            n1 = scan.nextInt();
            n2 = scan.nextInt();

            int res = calFact(n1, n2);
        System.out.println(res);
    }

    private static int calFact(int n1, int n2) {

        if(n1==n2)
            return n1;
        return n1 + calFact(n1+1, n2);
    }
};