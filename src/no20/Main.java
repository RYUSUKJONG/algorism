package no20;

public class Main {
    public static int getNum(int i){   //개수 카운트 함수
        int j = 0;

        while(i>0){
            if(i%10==3 || i % 10 == 6 || i%10 == 9){
                j++;
            }
            i/=10;
        }
        return j;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int cnt = getNum(i); // 3 6 9 개수를 판별
            if(cnt==0){  // 3 6 9 없을 시
                System.out.print(i+" ");
            }
            else{
                for(int l=0; l<cnt; l++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            }
        }
    }

};