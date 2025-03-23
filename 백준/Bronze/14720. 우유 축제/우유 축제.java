import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cur = 0, cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp == cur) {
                if(cur == 2) cur = 0;
                else cur++;
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}