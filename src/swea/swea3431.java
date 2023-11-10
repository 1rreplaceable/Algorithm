package swea;

import java.util.Scanner;

public class swea3431 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();

            int ans = 0;
            if (X >= L & X <= U) {
                ans = 0;
            } else if (X > U) {
                ans = -1;
            } else if (X < L) {
                ans = L - X;
            }


            System.out.println("#" + test_case + " " + ans);
        }
    }
}
