import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            sb.append("Case #").append(i+1).append(": ");
            int N = Integer.parseInt(br.readLine());
            if(N <= 25) sb.append("World Finals");
            else if(N <= 1000) sb.append("Round 3");
            else if(N <= 4500) sb.append("Round 2");
            else sb.append("Round 1");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}