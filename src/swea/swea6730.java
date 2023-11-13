package swea;

import java.util.Scanner;

public class swea6730 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int before = 0;
            int max = 0;
            int min = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                if (i == 0) {
                    before = a;
                } else {
                    if (a - before > 0) {
                        max = Math.max(max, (a - before));
                    } else if (a - before < 0) {
                        min = Math.min(min, (a - before));
                    }
                    before = a;
                }
            }


            System.out.println("#" + test_case + " " + max + " " + (min * -1));
        }
    }
}
