package no28;

//10진수를 n진수로 변환

public class Main {
    public static void main(String[] args) {
        char[] n = new char[100];
        // 10->A, 11->B ... 문자가 들어감
        int num = 20000;
        int jinsu = 16;

        int i = 0;

        while (num>0){
            int tmp = num % jinsu;

            if(tmp >= 10 && tmp <=15){
                n[i] = (char) ('A'+(tmp-10));
            }
            else{
                n[i] = (char) ('0'+tmp);
            }
            num /= jinsu;
            i++;
        }
        i--;
        for (;i>=0;i--) {
            System.out.print(n[i]);
        }
    }
};