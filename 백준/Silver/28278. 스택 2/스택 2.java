import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int topIndex = -1;
        for (int i = 0; i < N; i++) {
            String op = br.readLine();
            if (op.charAt(0) == '3') sb.append(topIndex + 1).append("\n");
            else if (op.charAt(0) == '4') sb.append(topIndex == -1 ? "1\n" : "0\n");
            else if (op.charAt(0) == '5') sb.append(topIndex != -1 ? arr[topIndex] : -1).append("\n");
            else if (op.charAt(0) == '2') {
                if (topIndex == -1) sb.append("-1\n");
                else sb.append(arr[topIndex--]).append("\n");
            } else {
                StringTokenizer st = new StringTokenizer(op);
                st.nextToken();
                arr[++topIndex] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(sb);
        br.close();
    }
}