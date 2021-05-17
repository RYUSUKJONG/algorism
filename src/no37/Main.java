package no37;

public class Main {

    static final int SIZE = 5;
    static final int APART = 1;

    static int [][]map = {
            {0,0,0,1,1},
            {0,0,0,0,1},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,0,1,1}
    };

    static int apartCnt = 0;
    static int[] houseHold = new int[10];


    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) { //행 
            for (int j = 0; j < SIZE; j++) {  //열
                if(map[i][j]==1){
                    head(i, j, apartCnt);
                    apartCnt++;
                }
            }
        }

        System.out.println(apartCnt);
        for(int i : houseHold){
            System.out.print(i+" ");
        }


    }

    public static void head(int y, int x, int apartCnt) {
        map[y][x] = 0;
        houseHold[apartCnt]++;

        if(x-1 >= 0 && map[y][x-1]==APART){
            head(y, x-1, apartCnt);
        }

        if(x+1 <= SIZE-1 && map[y][x+1]==APART){
            head(y, x+1, apartCnt);
        }
        if(y-1 >= 0 && map[y-1][x]==APART){
            head(y-1, x, apartCnt);
        }
        if(y+1 <= SIZE-1 && map[y+1][x]==APART){
            head(y+1, x, apartCnt);
        }

    }
};

























