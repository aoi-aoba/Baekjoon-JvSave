import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), answer = 0;
        for (int i = 0; i < N; i++) {
            char[] string = br.readLine().toCharArray();
            Stack<Integer> stack = new Stack<>();
            for (char ch : string) {
                if(stack.isEmpty()) stack.push(ch == 'A' ? 1 : 2);
                else if ((ch == 'A' && stack.peek() == 1) || (ch == 'B' && stack.peek() == 2)) stack.pop();
                else stack.push(ch == 'A' ? 1 : 2);
            }
            if(stack.isEmpty()) answer++;
        }
        System.out.println(answer);
    }
}
