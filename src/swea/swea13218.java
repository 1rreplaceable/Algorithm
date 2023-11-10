package swea;

import java.util.Scanner;

public class swea13218 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

           int N = sc.nextInt();

           int ans = N / 3;


            System.out.println("#" + test_case + " " + ans);
        }
    }
}
