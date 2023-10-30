package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ans = 1;

        for(int i = N;  i>0; i--){
            ans *= i;
        }
        System.out.println(ans);
        bw.close();
        br.close();
    }


}
