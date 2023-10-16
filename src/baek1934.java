import java.io.*;
import java.util.StringTokenizer;

public class baek1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int max = 0;
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= A && j <= B; j++) {
                if (A % j == 0 && B % j == 0) {
                    max = j;
                }
            }
            int min = A * B / max;
            bw.write(min+"\n");


        }


        bw.flush();
        bw.close();
        br.close();

    }
}
