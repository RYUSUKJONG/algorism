package no35;

public class Main {
    public static void main(String[] args) {
        int num = 2312;

        highNum(num);
    }

    private static void highNum(int num) {
        if(num/10 == 0){
            System.out.println(num);
            return;
        }

        highNum(num/10);
        System.out.println(num%10);
    }
};