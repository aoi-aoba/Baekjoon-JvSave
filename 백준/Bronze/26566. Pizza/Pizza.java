import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int p1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            double x1 = 1.0 * a / p1;
            double x2 = Math.PI * r * r / p2;
            System.out.println(x1 < x2 ? "Whole pizza" : "Slice of pizza");
        }
        br.close();
    }
}