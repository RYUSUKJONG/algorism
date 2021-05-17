package no34;

public class Main {
    public static void main(String[] args) {

        int result = fibonaci(6);

        System.out.println(result);

    }

    private static int fibonaci(int i) {
        if(i==1){
            return 1;
        }
        if(i==2){
            return 1;
        }
        return fibonaci(i-1)+fibonaci(i-2);
    }
};