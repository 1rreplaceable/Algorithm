package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arrN = new String[N];
        String[] arrM = new String[M];
        for (int i = 0; i < N; i++) {
            arrN[i] = br.readLine();
        }
        int cnt = 0;
        int a = M < N ? M : N;
        String[] answer = new String[a];
        for (int i = 0; i < M; i++) {
            arrM[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(arrM[i].equals(arrN[j])){
                    answer[cnt++] = arrM[i];
                }
            }
        }
        bw.write(cnt+"\n");
        for(int i = 0; i < answer.length; i++){
            if(answer[i] != null) {
                bw.write(answer[i]+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
