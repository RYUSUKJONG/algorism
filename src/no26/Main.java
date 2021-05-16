package no26;

public class Main {
    public static void main(String[] args) {

        int a = 734;
        int b = 896;

        int arrA[] = new int[3];
        int arrB[] = new int[3];

        do {
            for (int i = arrA.length-1; i >=0 ; i--) {
                arrA[i] = a%10;
                a /=10;
            }
        }while (a>0);


        do {
            for (int i = arrB.length-1; i >=0 ; i--) {
                arrB[i] = b%10;
                b /=10;
            }
        }while (b>0);

        int reA = 0 ;
        int n1 = 1;
        for (int i = 0; i <arrA.length ; i++) {
            reA += arrA[i] * n1;
            n1=n1*10;
        }

        int reB = 0 ;
        int n2 = 1;
        for (int i = 0; i <arrB.length ; i++) {
            reB += arrB[i] * n2;
            n2=n2*10;
        }

        System.out.println(reA);
        System.out.println(reB);

        if(reA > reB){
            System.out.println(reA);
        }
        else if(reB > reA){
            System.out.println(reB);
        }
        else{
            System.out.println("같습니다");
        }

    }
};