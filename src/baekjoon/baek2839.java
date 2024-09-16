package baekjoon;

import java.io.*;

public class baek2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                n = 0;
                break;
            } else {
                n -= 3;
                cnt++;
            }
        }
        if (n < 0) {
            bw.write("-1\n");
        } else {
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}
