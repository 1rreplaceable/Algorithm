package swea;

import java.util.Scanner;

public class swea10505 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] arrN = new int[N];
            double avg = 0;
            int sum = 0;
            int ans = 0;
            for(int i=0; i< N; i++){
                arrN[i] = sc.nextInt();
                sum += arrN[i];
            }
            avg = (double) sum / N;
            for(int i=0; i< N; i++){
                if(arrN[i]<= avg){
                    ans++;
                }
            }
            System.out.println("#" + test_case + " " + ans);
        }
    }
}
