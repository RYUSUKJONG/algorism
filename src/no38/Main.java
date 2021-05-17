package no38;

public class Main {
    static int cnt = 0;

    public static int Chiken(int x, int y){

        if(cnt%y==0&&cnt>0)
            x++;
        cnt++;

        if(x==0){
            cnt--;
            int r = cnt;
            cnt = 0;
            return r;
        }
        return Chiken(x-1, y);
    }


    public static void main(String[] args) {
        int n1=4, n2=3;
        int n3=10, n4=3;
        int n5=100, n6=5;


        int res = Chiken(n1, n2);
        int res1 = Chiken(n3, n4);
        int res2 = Chiken(n5, n6);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);

    }
};