package no29;

public class Main {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,6,7,8};

        boolean aFlag = true;
        boolean bFlag = true;

        if(arr[0]!=1){
            aFlag = false;
        }
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]-arr[i+1] !=-1){
                aFlag = false;
            }
        }

        if(aFlag==true) {
            System.out.println("ascending");
        }

        if(arr[arr.length-1]!=8){
            bFlag = false;
        }
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]-arr[i+1] !=1){
                bFlag = false;
            }
        }

        if(bFlag==true) {
            System.out.println("descending");
        }

        if(bFlag==false && aFlag==false){
            System.out.println("mixed");
        }

    }
};