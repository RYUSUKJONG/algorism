package no38;

public class Main2 {
    public static void main(String[] args) {
        int n1=100, n2=5;
        Chiken(n1, n2);
    }

    private static void Chiken(int n1, int n2) {
        int cnt = 0;
        int k = 0;

        for (int i = 1; i <= n1; i++) {
            cnt++;
            if(cnt%n2==0){
                n1++;
            }
        }
        System.out.println(cnt);
    }
};