import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int tot = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int b = Integer.parseInt(st.nextToken());
            tot += b/a;
        }
        System.out.println(tot);
        br.close();
    }
}