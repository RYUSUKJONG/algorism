package no23;

public class Main {
    public static void main(String[] args) {
        String n = "ABCDE"; // EDCBA

        char[] str = n.toCharArray();
        int len = str.length;
        char tmp;

        for (int i = 0; i < len/2; i++) {
            tmp = str[i];
            str[i]=str[len-i-1];
            str[len-i-1] = tmp;
        }

        n = new String(str);
        System.out.println(n);
    }
};