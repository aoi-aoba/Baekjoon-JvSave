import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Z = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<Z; i++) {
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            sb.append(W*K/2).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}