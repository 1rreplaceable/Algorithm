package swea;

import java.util.Scanner;

public class swea1970 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.println("#" + test_case);
            int N = sc.nextInt();
            int[] arr = new int[8];

            while (N >= 10)
                if (N >= 50000) {
                    arr[0] += N / 50000;
                    N %= 50000;
                } else if (N >= 10000) {
                    arr[1] += N / 10000;
                    N %= 10000;
                } else if (N >= 5000) {
                    arr[2] += N / 5000;
                    N %= 5000;
                } else if (N >= 1000) {
                    arr[3] += N / 1000;
                    N %= 1000;
                } else if (N >= 500) {
                    arr[4] += N / 500;
                    N %= 500;
                } else if (N >= 100) {
                    arr[5] += N / 100;
                    N %= 100;
                } else if (N >= 50) {
                    arr[6] += N / 50;
                    N %= 50;
                } else {
                    arr[7] += N / 10;
                    N %= 10;
                }

            for(int i=0; i< arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }

}

