import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()), ans = 0;
        boolean[] arr = new boolean[1000];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            if(Integer.parseInt(st.nextToken()) == 0) arr[i] = false;
            else arr[i] = true;
        }
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            if(arr[i]) ans += Math.max(R-L, 0);
        }
        System.out.println(ans);
        br.close();
    }
}