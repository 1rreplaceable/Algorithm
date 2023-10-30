package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class baek2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int GCD = 1;
        int min = A < B ? A : B;
        int LCM = min;
        int idx = 1;
        for(int i=1; i <= min; i++){
            if(A % i == 0 && B % i == 0){
                GCD = i;
            }
        }
        while(true){
            if(LCM % A == 0 && LCM % B == 0){
                break;
            }
            idx++;
            LCM = min * idx;
        }
        System.out.println(GCD);
        System.out.println(LCM);
        bw.flush();
        bw.close();
        br.close();

    }
}
