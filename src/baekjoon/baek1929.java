package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int min = M < N ? M : N;
        int max = M > N ? M : N;

        int[] arr = new int[max+1];

        for(int i = 2; i <= max; i++){
            arr[i] = i;
        }

        for(int i=2;i<=max;i++) {
            if(arr[i]==0) continue;

            for(int j=2*i;j<=max; j+=i) {
                arr[j] = 0;
            }
        }

        for(int i=min;i<=max;i++) {
            if(arr[i]!=0) System.out.println(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }


}
