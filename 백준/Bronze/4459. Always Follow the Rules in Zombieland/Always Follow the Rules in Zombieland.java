import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] strings = new String[N+1];
        for (int i = 1; i <= N; i++) strings[i] = br.readLine();
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp > 0 && temp <= N) sb.append("Rule ").append(temp).append(": ").append(strings[temp]);
            else sb.append("Rule ").append(temp).append(": No such rule");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}