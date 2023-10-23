package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int j = 1; j <= B && j <= D; j++) {
            if (B % j == 0 && D % j == 0) {
                max = j;
            }
        }
        int mom = B * D / max;

        int fir = mom / B;
        int sec = mom / D;
        int son = A * fir + C * sec;
        int div = 0;
        for (int j = 1; j <= mom && j <= son; j++) {
            if (mom % j == 0 && son % j == 0) {
                div = j;
            }
        }

        bw.write(son/div+" "+mom/div);

        bw.flush();
        bw.close();
        br.close();

    }
}
