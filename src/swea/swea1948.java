package swea;

import java.util.Scanner;

public class swea1948 {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[] all_plus = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            int ans = (d2+all_plus[m2-1]) - (d1+all_plus[m1-1]) + 1;
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
