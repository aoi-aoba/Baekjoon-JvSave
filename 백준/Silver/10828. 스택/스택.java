import java.util.*;
import java.io.*;

public class Main {
    public static int[] stack;
    public static int topIndex = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int stack_size = Integer.parseInt(br.readLine());
        stack = new int[stack_size];
        for(int i=0; i<stack_size; i++) {
            String op = br.readLine();
            if(op.equals("size")) sb.append(topIndex + 1).append("\n");
            else if(op.equals("empty")) sb.append(topIndex == -1 ? 1 : 0).append("\n");
            else if(op.equals("top")) sb.append((topIndex == -1) ? -1 : stack[topIndex]).append("\n");
            else if(op.equals("pop")) {
                if(topIndex == -1) sb.append(-1).append("\n");
                else sb.append(stack[topIndex--]).append("\n");
            } else {
                StringTokenizer st = new StringTokenizer(op);
                st.nextToken();
                stack[++topIndex] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(sb);
        br.close();
    }
}
