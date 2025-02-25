import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int res = 0;
        for(int i=0; i<N; i++) {
            String prob = br.readLine();
            int pos_ans = 0;
            for(int j=0; j<prob.length(); j++)
                if(prob.charAt(j) == 'O') pos_ans++;
            if(pos_ans >= prob.length() / 2.0) res++;
        }
        System.out.println(res);
        br.close();
    }
}