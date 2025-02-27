import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens(), sum = 0;
            for(int j=0; j<cnt; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
        br.close();
    }
}