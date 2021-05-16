package no27;

public class Main {
    public static void main(String[] args) {

        int n = 6;
        int arr[][] = new int[n][n];

        int x = 0;
        int y = 0;
        int num = 1;

        int cnt = n;

        for (int i = 0; i < 2*n-1; i++) {
            switch (i%4){   //방향에 따라 나누기
                case 0:  //오른쪽 방향
                    for (int k = 0; k < cnt; k++) {
                        arr[y][x] = num;
                        x++;
                        num++;
                    }
                    x--;
                    y++;
                    cnt--;
                    break;

                case 1:  //아래쪽 방향
                    for (int j = 0; j < cnt; j++) {
                        arr[y][x] = num;
                        y++;
                        num++;
                    }
                    y--;
                    x--;
                    // 4번 4번 진행하기 때문에 감소하지 않아도 됨
                    break;
                case 2:  //왼쪽 방향
                    for (int j = 0; j < cnt; j++) {
                        arr[y][x] = num;
                        x--;
                        num++;
                    }
                    y--;
                    x++;
                    cnt--;
                    break;
                case 3:  //위쪽 방향
                    for (int j = 0; j < cnt; j++) {
                        arr[y][x] = num;
                        num++;
                        y--;
                    }
                    y++;
                    x++;
                    break;
                default:
                    break;
            }

        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.printf("%3d", arr[j][k]);
            }
            System.out.println();
        }



    }
};