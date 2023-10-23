package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baek1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i=A; i <=B; i++){
            if(sosu(i)){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
    static boolean sosu(int k){
        int a =0;
        for(int i=1; i<=k/2; i++){
            if(k%i==0){
                a++;
            }
        }
        if(a==1){
            return true;
        }else{
            return false;
        }
    }

}
