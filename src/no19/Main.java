package no19;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 7;
        int result = 1;

        for(int i=1; i<=m; i++){
            result *= n;
        }
        System.out.println(result);
    }
};