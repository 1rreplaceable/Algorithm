package swea;

import java.util.Scanner;

public class swea1976 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int h1 = sc.nextInt();
            int m1 = sc.nextInt();

            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int h_ans = 0;
            int m_ans = 0;

            m_ans = m1 + m2;
            h_ans = h1 + h2;
            if (m_ans >= 60) {
                m_ans -= 60;
                h_ans += 1;
            }
            if (h_ans > 12) {
                h_ans -= 12;
            }
            System.out.println("#" + test_case + " " + h_ans + " " + m_ans);


        }
    }
}
