import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cntMax = 0, cntNow = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(st.nextToken());
        for(int i = 1; i < T; i++) {
            int now = Integer.parseInt(st.nextToken());
            if(targetNum > now) cntNow++;
            else {
                targetNum = now;
                cntMax = Math.max(cntMax, cntNow);
                cntNow = 0;
            }
        }
        cntMax = Math.max(cntMax, cntNow);
        System.out.println(cntMax);
        br.close();
    }
}