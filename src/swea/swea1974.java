package swea;

import java.util.Scanner;

public class swea1974 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int[][] arrN = new int[9][9];
            int cp = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arrN[i][j] = sc.nextInt();
                }
            }
           // 다시
            System.out.println("#" + test_case+" ");
        }
    }
}
