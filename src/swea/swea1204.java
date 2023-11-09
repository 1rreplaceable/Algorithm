package swea;

import java.util.Scanner;

public class swea1204 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            int[] arr = new int[101];
            int max = 0;
            int ans = 0;
            for (int i = 0; i < 1000; i++) {
                int k = sc.nextInt();
                arr[k]++;
                if(arr[k] >= max){
                    max = arr[k];
                    ans = k;
                }
            }
            System.out.println("#" + N + " " + ans);
        }

    }

}

