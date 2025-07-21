import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Object> stack = new Stack<>();
        String input = br.readLine();
        int result = 0;
        boolean isAns = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '[') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                int innerSum = 0;
                while (!stack.isEmpty() && stack.peek() instanceof Integer)
                    innerSum += (int) stack.pop();
                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop();
                    stack.push(innerSum == 0 ? 2 : innerSum * 2);
                } else stack.push(')');
            } else if (input.charAt(i) == ']') {
                int innerSum = 0;
                while (!stack.isEmpty() && stack.peek() instanceof Integer)
                    innerSum += (int) stack.pop();
                if (!stack.isEmpty() && stack.peek().equals('[')) {
                    stack.pop();
                    stack.push(innerSum == 0 ? 3 : innerSum * 3);
                } else stack.push(']');
            }
        }

        for (Object obj : stack) {
            if (obj instanceof Integer) result += (int) obj;
            else {
                isAns = false;
                break;
            }
        }

        bw.write(isAns ? result + "\n" : 0 + "\n");
        bw.flush();
    }
}