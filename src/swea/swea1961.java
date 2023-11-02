package swea;

import java.util.Scanner;

public class swea1961 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] arrN = new int[N][N];
            String[][] ans = new String[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arrN[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    ans[i][j] = "";
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0) {
                        for (int q = 0; q < N; q++) {
                            ans[j][i] += String.valueOf(arrN[N - q - 1][j]);
                        }
                    } else if (i == 1) {
                        for (int q = 0; q < N; q++) {
                            ans[j][i] += String.valueOf(arrN[N - j - 1][N - q - 1]);
                        }

                    } else if (i == 2) {
                        for (int q = 0; q < N; q++) {
                            ans[j][i] += String.valueOf(arrN[q][N - j - 1]);
                        }

                    }
                }
            }

            System.out.println("#" + test_case + " ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
