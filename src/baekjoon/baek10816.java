package baekjoon;

import java.util.Scanner;
// 시간초과
public class baek10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Narr = new int[N];

        for(int i=0; i <N; i++){
            Narr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] Marr = new int[M];

        for(int i=0; i <M; i++){
            int cnt = 0;
            Marr[i] = sc.nextInt();
            for(int j=0; j <N; j++){
                if(Marr[i] == Narr[j]){
                    cnt++;
                }
            }
            Marr[i] = cnt;
        }
        for(int i=0; i <M; i++){
            System.out.print(Marr[i]+" ");
        }
    }
}
