package swea;

import java.util.Scanner;

public class swea1979 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arrN = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arrN[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int cnt = 0;
                    int cnt2 = 0;
                    for (int q = j; q < j + K; q++) {
                        if (q == N) {
                            break;
                        }
                        if (arrN[i][q] == 1) {
                            cnt++;
                        }
                    }
                    for (int q = i; q < i + K; q++) {
                        if (q == N) {
                            break;
                        }
                        if (arrN[q][j] == 1) {
                            cnt2++;
                        }
                    }
                    if(j+K<N) {
                        if (cnt == K & arrN[i][j + K] != 1 | j + K == N) {
                            ans++;
                        }
                    } else if (i+K<N) {
                        if (cnt2 == K & arrN[i + K][j] != 1 | j + K == N) {
                            ans++;
                        }
                    }
                }
            }


            System.out.println("#" + test_case + " " + ans);
        }
    }
}
