package swea;

import java.util.Scanner;

public class swea1289 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {

            String N = sc.nextLine();
            String[] arrN = N.split("");
            int cnt = 0;
            if(arrN[0].equals("1")){
                cnt = 1;
            }
            for(int i = 1; i <arrN.length; i++){
                if(!(arrN[i].equals(arrN[i-1]))){
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " +cnt);

        }
    }
}
