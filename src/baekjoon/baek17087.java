package baekjoon;

import java.util.Scanner;

public class baek17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        long min = 1000000001;
        int[] arrN = new int[N];
        for(int i = 0; i < N; i++){
            int k  = sc.nextInt();
            int q = S-k;
            if(q < 0){
                q *= -1;
            }
            arrN[i] = q;
        }
        int result = arrN[0];
        for(int i = 1; i < N; i++){
            result = gcd(result, arrN[i]);
        }
        System.out.println(result);
    }
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

