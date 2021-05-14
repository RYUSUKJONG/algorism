package no11;

public class Main {
    public static void main(String[] args) {
        int  n = 4;

        int arr[][] = new int[n][n];


        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    arr[i][j] = i*n+j+1;
                }
            }

            else{
                for(int j=n-1; j>=0; j--){
                    arr[i][j]=i*n+n-j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();

        }



    }
};