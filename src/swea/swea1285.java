package swea;

import java.util.Scanner;

public class swea1285 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int min = 100001;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                if (a < 0) {
                    a *= -1;
                }
                if (a < min) {
                    min = a;
                    cnt = 1;
                } else if (a == min) {
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + min + " " + cnt);
        }
    }
}
