import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder res = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
                res.append(sb).append(" ");
            }
            res.append("\n");
        }
        System.out.print(res);
        br.close();
    }
}