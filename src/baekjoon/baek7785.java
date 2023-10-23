package baekjoon;

import java.util.Scanner;

public class baek7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] answer = new String[n];
        sc.nextLine();
        String[] arr = new String[n * 2];
        int temp = 0;
        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("enter")) {
                answer[temp++] = arr[i - 1];
            }
            if(arr[i].equals("leave")){
                for(int j=0; j < answer.length; j++){
                    if(answer[j].equals(arr[i-1])){

                    }
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println("answer[" + i + "] = " + answer[i]);
        }


    }
}
