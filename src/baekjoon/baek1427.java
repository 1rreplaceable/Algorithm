package baekjoon;

import java.util.Scanner;

public class baek1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[10];

        while (n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
        for(int i = 9; i>=0; i--){
            while(arr[i]-- > 0){
                System.out.print(i);
            }
        }

    }
}
