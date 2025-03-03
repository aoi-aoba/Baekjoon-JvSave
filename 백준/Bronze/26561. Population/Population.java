import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long t = Long.parseLong(st.nextToken());
            long pop = p - (t/7) + (t/4);
            System.out.println(pop);
        }
        br.close();
    }
}