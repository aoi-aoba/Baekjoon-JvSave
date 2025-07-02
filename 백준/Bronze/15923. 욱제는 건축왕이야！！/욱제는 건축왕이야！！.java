import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0, N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bef_x = Integer.parseInt(st.nextToken()), bef_y = Integer.parseInt(st.nextToken());
        int init_x = bef_x, init_y = bef_y;
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            res += (bef_x == x) ? Math.abs(bef_y - y) : Math.abs(bef_x - x);
            bef_x = x;
            bef_y = y;
        }
        res += (bef_x == init_x) ? Math.abs(bef_y - init_y) : Math.abs(bef_x - init_x);
        System.out.println(res);
    }
}