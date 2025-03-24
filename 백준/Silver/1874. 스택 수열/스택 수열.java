import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stackUpN = new Stack<>();
        int N = Integer.parseInt(br.readLine()), now = 1;
        boolean canFind = true;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            int targetNum = Integer.parseInt(br.readLine());
            while(now <= targetNum) {
                stackUpN.push(now);
                sb.append("+\n");
                now += 1;
            }
            if(stackUpN.peek() == targetNum) {
                stackUpN.pop();
                sb.append("-\n");
            } else canFind = false;
        }
        if(!canFind) System.out.println("NO");
        else System.out.println(sb);
    }
}