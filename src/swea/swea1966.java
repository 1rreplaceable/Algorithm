package swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea1966 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] arrN = new int[N];
            for(int i=0; i <N; i++){
                arrN[i]=sc.nextInt();
            }
            Arrays.sort(arrN);
            System.out.print("#" + test_case);
            for(int i=0; i <N; i++){
                System.out.print(" "+arrN[i]);
            }

            System.out.println();

        }
    }
}
