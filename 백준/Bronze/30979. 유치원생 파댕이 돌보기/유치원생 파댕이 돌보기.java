import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine());
        int timeSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            timeSum += Integer.parseInt(st.nextToken());
        }

        System.out.println((timeSum >= T) ? "Padaeng_i Happy" : "Padaeng_i Cry");
        br.close();
    }
}