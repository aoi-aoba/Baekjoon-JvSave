import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;
            char[] str = input.toCharArray();
            Stack<Integer> stack = new Stack<>();
            boolean isBalanced = true;
            for (char c : str) {
                if (c == '(') stack.push(1);
                else if (c == '[') stack.push(2);
                else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == 1) stack.pop();
                    else { isBalanced = false; break; }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == 2) stack.pop();
                    else { isBalanced = false; break; }
                }
            }
            sb.append(stack.isEmpty() && isBalanced ? "yes" : "no").append("\n");
        }
        System.out.println(sb);
    }
}