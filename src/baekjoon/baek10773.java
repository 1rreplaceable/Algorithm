package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baek10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                stack.pop();
            }
            else {
                stack.push(a);
            }
        }
        int sum = 0;
        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}
