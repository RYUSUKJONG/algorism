package no18;

public class Main {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <=n; i++) {
            for (int j = n; j >0; j--) {
                if(i<j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
};