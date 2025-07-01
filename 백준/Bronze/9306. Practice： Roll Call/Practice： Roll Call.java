import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String first = br.readLine(), last = br.readLine();
            sb.append("Case ").append(i).append(": ").append(last).append(", ").append(first).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}