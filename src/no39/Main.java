package no39;

public class Main {

    static int cnt = 0;
    static int[] cache = new int[1000];

    public static void main(String[] args) {

        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 4;

        int n = 10;
        System.out.println(hap(n));

    }

    private static int hap(int i) {
        if(cache[i]!=0){
            return cache[i];
        }
        return cache[i] = hap(i-1)+hap(i-2)+hap(i-3);
    }
};