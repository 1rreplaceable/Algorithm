package baekjoon;

import java.io.*;
import java.util.Arrays;


public class baek11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] ans = new String[s.split("").length];
        String[] arrS = s.split("");
        for(int i=0; i < arrS.length; i++){
            String a = "";
            for(int j=i; j < arrS.length; j++){
                a+=arrS[j];
            }
            ans[i] = a;
        }

        Arrays.sort(ans);

        for(int i=0; i < ans.length; i++){
            bw.write(ans[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
