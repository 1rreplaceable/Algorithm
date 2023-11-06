package swea;

import java.util.Scanner;

public class swea2005 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            System.out.println("#" + test_case);
            int[][] arrN = new int[N][N];
            arrN[0][0] = 1;
            for(int i=1; i<N;i++){
                arrN[i][0] = 1;
                arrN[i][i] = 1;
                for(int j = 1; j<i; j++){
                    arrN[i][j] = arrN[i-1][j-1] + arrN[i-1][j];
                }
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(arrN[i][j]!=0) {
                        System.out.print(arrN[i][j]+" ");
                    }
                }
                System.out.println();
            }


        }
    }
}
