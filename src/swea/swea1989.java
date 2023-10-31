package swea;

import java.io.*;

public class swea1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i=1; i <=a; i++){
            String s = br.readLine();
            int ans = palindrome(s);

            System.out.println("#"+i+" "+ans);

        }

        bw.close();
        br.close();

    }

    static int palindrome(String s){
        String[] arr = s.split("");
        int n = 0;
        for(int i=0;  i<=arr.length-1; i++){
            if(arr[i].equals(arr[arr.length-i-1])){
                n = 1;
            }else{
                n = 0;
            }
        }
        return n;
    }

}
