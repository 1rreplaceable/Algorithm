package baekjoon;

import java.util.*;

public class baek10844 {

    static long[][] dp;
    static long mod = 1000000000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        dp = new long[N+1][10];

        for(int i=1;i<10;i++) {
            dp[1][i]=1;
        }

        for(int i=2;i<=N;i++) {
            for(int j=0; j<10; j++) {
                if(j==0) {
                    dp[i][j]=dp[i-1][1]%mod;
                }else if(j==9) {
                    dp[i][j]=dp[i-1][8]%mod;
                }else {
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%mod;
                }
            }
        }

        System.out.println(Arrays.stream(dp[N]).sum()%mod);
        sc.close();
    }
}
