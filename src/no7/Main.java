package no7;

public class Main {

    public static void main(String[] args) {
        int num = 12;
        int gcd = 1;

        for(int i=1; i<num; i++){
            if(num%i==0){
                gcd = i;
            }
        }
        if(gcd==1){
            System.out.println(num+"은 소수입니다");
        }
        else{
            System.out.println(num+"은 소수가 아닙니다.");
        }

    }
};