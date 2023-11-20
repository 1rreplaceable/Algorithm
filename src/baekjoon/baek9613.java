package baekjoon;

import java.util.Scanner;

public class baek9613 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc=0; tc <t; tc++){
            int N = sc.nextInt();
            int[] arrN = new int[N];
            for(int j = 0; j <N; j++){
                arrN[j] = sc.nextInt();
            }
            long sum = 0;
            for(int i=0;i<N;i++) {
                for(int j=i;j<N;j++) {
                    if(i!=j) {
                        sum+=gcd(arrN[i],arrN[j]);
                    }
                }
            }
            System.out.println(sum);
        }
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

}
