package baekjoon;

import java.io.*;

public class baek1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int k = 1;
        int c = 10;
        for (int i = 1; i <= n; i++) {
            if (i % c == 0) {
                k++;
                c *= 10;
            }
            cnt += k;
        }
        sb.append(cnt);
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}
