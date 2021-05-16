package no21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean arr[] = new boolean[101];
        int inArr[] = new int[101];
        inArr[0] = 1;
        inArr[1] = 3;
        inArr[2] = 1;
        inArr[3] = 3;
        inArr[4] = 4;
        inArr[5] = 2;
        inArr[6] = 3;
        inArr[7] = 5;
        inArr[8] = 5;
        inArr[9] = 15;

        for (int i = 0; i < inArr.length; i++) {
                arr[inArr[i]]=true;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]){
                System.out.println(i);
            }

        }



    }
};