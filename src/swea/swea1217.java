package swea;

import java.util.Scanner;

public class swea1217 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        for(int i=0; i<10; i++){
            int T;
            T = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int ans = 1;

            for(int j = 0; j <B; j++){
                ans *= A;
            }

            System.out.println("#"+T+" "+ans);
        }

    }
}
