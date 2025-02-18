import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp < X) sb.append(temp).append(" ");
        }

        System.out.println(sb);
    }
}