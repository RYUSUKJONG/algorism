package no36;

public class Main {


    public static void main(String[] args) {
    int num = 17;

    jinsu(num);
    }

    private static void jinsu(int num) {
        if(num/2 == 0){
            System.out.print(num);
            return;
        }

        jinsu(num/2);
        System.out.print(num%2);
    }
};