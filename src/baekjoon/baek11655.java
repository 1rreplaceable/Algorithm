package baekjoon;

import java.io.*;
import java.util.Arrays;


public class baek11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] arrS = s.split("");

        for (int i = 0; i < arrS.length; i++) {
            char a = s.charAt(i);
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                for (int j = 0; j < 13; j++) {
                    if (a == 90 || a == 122) {
                        a -= 25;
                    }else{
                        a += 1;
                    }
                }
            }
            bw.write(a);
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
