package no22;

public class Main {
    public static void main(String[] args) {

        String n = "12344321";

        int len = n.length();
        boolean flag = false;

        for (int i = 0; i < len/2; i++) {
            if(n.charAt(i) != n.charAt(len-i-1)){
                flag = false;
            }
            else {
                flag = true;
            }
        }
        System.out.println(flag);
    }
};