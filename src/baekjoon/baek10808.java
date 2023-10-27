package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] ans = new int[26];
        String[] arrS = s.split("");

        for(int i = 0; i < arrS.length; i++){
            char a = s.charAt(i);
            ans[a-97]++;
        }
        for(int i=0; i<ans.length; i++){
            bw.write(ans[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
