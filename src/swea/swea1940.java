package swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea1940 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int sum = 0;
            int ns = 0;
            for(int i=0; i <N; i ++) {
                int a = sc.nextInt();
                int b = 0;
                if (a != 0) {
                    b = sc.nextInt();
                }
                if (a == 1) {
                    ns += b;
                    sum += ns;
                } else if (a == 2) {
                    ns -= b;
                    if(ns<0){
                        ns=0;
                    }
                    sum += ns;
                } else if (a == 0) {
                    sum += ns;
                }
            }
            System.out.println("#" + test_case+" "+sum);
        }
    }
}
