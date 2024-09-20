package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                stack.push('(');
            } else if (p.charAt(i) == ')') {
                stack.pop();
            }
            if (i > 0) {
                if (p.charAt(i - 1) == '(' && p.charAt(i) == ')') {
                    res += stack.size();
                } else if (p.charAt(i - 1) == ')' && p.charAt(i) == ')') {
                    res++;
                }
            }
        }
        System.out.println(res);

    }
}
