package baekjoon;

import java.io.*;

public class baek4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        for(int i = 0; i < N; i++){
            long ans = 0;
            long k = Integer.parseInt(br.readLine());
            ans = sosu(k);
            bw.write(ans+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static long sosu(long k){
        int a =0;
        for(long i=2; i<k/2; i++){
            if(k%i==0){
                a++;
            }
        }
        if(a==0){
            return k;
        }else{
            return sosu(k+1);
        }
    }
}
