package swea;

import java.util.Scanner;

public class swea1926 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String[] s = (i + "").split("");
            int cnt = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[j].equals("3")||s[j].equals("6")||s[j].equals("9")){
                    cnt+=1;
                }
            }
            if(cnt==0){
                System.out.print(i);
            }else{
                for(int q = 0; q<cnt; q++){
                    System.out.print("-");
                }
            }
            System.out.print(" ");
        }


    }
}
