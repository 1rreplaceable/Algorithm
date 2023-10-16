import java.io.*;
import java.util.StringTokenizer;

public class baek2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];

        for(int i = 0; i < N; i++){
            int a =Integer.parseInt(br.readLine());
            arrN[i] = a;
        }

        int gcd = 0;
        for(int i=0; i < N-1; i++){
            int dist = arrN[i+1] - arrN[i]; // 나무들 사이 거리
            gcd = GCD(dist,gcd);
        }
        System.out.println((arrN[N-1]-arrN[0])/gcd+1-(arrN.length));

        bw.flush();
        bw.close();
        br.close();

    }
    static int GCD(int a, int b)
    {
        if(b==0)return a;
        else return GCD(b,a%b);
    }
}
