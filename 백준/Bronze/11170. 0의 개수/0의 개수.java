import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int j=start; j<=end; j++) {
                char[] str = String.valueOf(j).toCharArray();
                for(char c : str) if(c == '0') cnt++;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}