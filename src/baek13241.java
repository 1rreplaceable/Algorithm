import java.io.*;
import java.util.StringTokenizer;

public class baek13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        for (int j = 1; j <= A && j <= B; j++) {
            if (A % j == 0 && B % j == 0) {
                max = j;
            }
        }
        String min = A * B / max+"";
        bw.write(min);

        bw.flush();
        bw.close();
        br.close();

    }
}
