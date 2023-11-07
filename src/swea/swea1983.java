package swea;

import java.util.Scanner;

public class swea1983 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] total = new int[N];
            int scoreK = 0;
            for (int i = 0; i < N; i++) {
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int assignment = sc.nextInt();

                total[i] = mid * 35 + fin * 40 + assignment * 20;
                if (i == K - 1) {
                    scoreK = total[i];
                }
            }
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (total[i] > scoreK) {
                    cnt++;
                }
            }
            double grade = Math.ceil((double) (cnt + 1) / ((double) N / 10));
            int grade2 = (int) grade;

            String ans = "";

            switch (grade2) {
                case 1:
                    ans = "A+";
                    break;
                case 2:
                    ans = "A0";
                    break;
                case 3:
                    ans = "A-";
                    break;
                case 4:
                    ans = "B+";
                    break;
                case 5:
                    ans = "B0";
                    break;
                case 6:
                    ans = "B-";
                    break;
                case 7:
                    ans = "C+";
                    break;
                case 8:
                    ans = "C0";
                    break;
                case 9:
                    ans = "C-";
                    break;
                case 10:
                    ans = "D0";
                    break;
            }
            System.out.println("#" + test_case + " " + ans);
        }

    }

}

