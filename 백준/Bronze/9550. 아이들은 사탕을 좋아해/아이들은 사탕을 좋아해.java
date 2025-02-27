import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int cnt = 0;
            
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                cnt += temp / K;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}