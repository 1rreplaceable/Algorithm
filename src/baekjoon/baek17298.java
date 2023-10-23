package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i <N; i ++){

            arrN[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i < arrN.length-1; i++){
            int ans = arrN[i];
            int q = -1;
            for(int j = i+1; j < arrN.length; j++){
                if(arrN[j] > ans){
                    q = arrN[j];
                    break;
                }
            }
            bw.write(q+" ");
        }
        bw.write("-1");
        bw.flush();

        bw.close();
        br.close();
    }


}
