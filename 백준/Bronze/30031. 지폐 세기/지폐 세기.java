import java.io.*;
import java.util.*;

public class Main {
    private static final int WIDTH_1000 = 136;
    private static final int WIDTH_5000 = 142;
    private static final int WIDTH_10000 = 148;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()), res = 0;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            if(width == WIDTH_1000) res += 1000;
            else if(width == WIDTH_5000) res += 5000;
            else if(width == WIDTH_10000) res += 10000;
            else res += 50000;
        }
        System.out.println(res);
        br.close();
    }
}