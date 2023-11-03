package swea;

import java.util.Scanner;

public class swea2001 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] arrN = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arrN[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i <= N-M; i++) {
                for (int j = 0; j <= N-M; j++) {
                    int sum = 0;
                    for(int x = i; x<i+M; x++){
                        for(int y = j; y<j+M; y++){
                            sum += arrN[x][y];
                        }
                    }
                    max = Math.max(sum, max);
                }
            }
            System.out.println("#" + test_case+" "+max);
        }
    }
}
