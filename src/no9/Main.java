package no9;

public class Main {
    public static void main(String[] args) {
        int num = 1242;
        int sum = 0;

        // 1232 >> 1의 자리를 구함 =>123 => 12 => 1
        // 몫 <-> 나머지

        while(num>0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
};