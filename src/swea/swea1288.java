package swea;

import java.util.Scanner;

public class swea1288 {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int[] arr =new int[10];

            int cnt =0;
            int ans =1;
            int j = n;
            while(cnt < 10) {
                cnt =0;
                String N = n+"";
                String[] arrN = N.split("");
                for(int i=0; i < arrN.length; i++){
                    arr[Integer.parseInt(arrN[i])]++;
                }
                for(int i=0; i< arr.length; i++){
                    if(arr[i]>0){
                        cnt++;
                    }
                }
                ans++;
                n = j* ans;
            }
            System.out.println("#"+test_case+" "+(n-j));
        }
    }
}
