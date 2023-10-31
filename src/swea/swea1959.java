package swea;

import java.util.Scanner;

public class swea1959 {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] narr = new int[n];
            int[] marr = new int[m];
            for(int i=0; i <n; i ++){
                narr[i] = sc.nextInt();
            }
            for(int i=0; i <m; i ++){
                marr[i] = sc.nextInt();
            }
            int min = Math.min(n,m);
            int max = Math.max(n,m);
            int ans = 0;
            for(int i=0; i <= max-min; i ++){
                int sum = 0;
                for(int j=0; j< min; j++){
                    if(n>m){
                        sum += marr[j] * narr[j + i];
                    }else {
                        sum += narr[j] * marr[j + i];
                    }
                }
                ans = Math.max(sum, ans);
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
