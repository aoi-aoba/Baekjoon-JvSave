import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            char[] str = br.readLine().toCharArray();
            Stack<Integer> stack = new Stack<>();
            boolean isVPS = true;
            for(char c : str) {
                if(c == '(') stack.push(1);
                else if(!stack.isEmpty()) stack.pop();
                else {
                    isVPS = false;
                    break;
                }
            }
            sb.append(stack.isEmpty() && isVPS ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }
}
