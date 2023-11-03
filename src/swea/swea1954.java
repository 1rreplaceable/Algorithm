package swea;

import java.util.Scanner;

public class swea1954 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] arrN = new int[N][N];
            int a = 1;
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arrN[i][j] = a++;
                    if(a>N){
                        arrN[N-2][N] = a++;
                    } else if (a==2*N) {
                        arrN[N-1][N-2]= a++;
                    }
                }
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arrN[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("#" + test_case + " " );
        }
    }
}
