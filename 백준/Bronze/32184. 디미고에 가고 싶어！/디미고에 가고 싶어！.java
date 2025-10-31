import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        if (a % 2 == 0) {
            cnt++;
            a++;
        }
        if (b % 2 == 1) {
            cnt++;
            b--;
        }
        cnt += (b - a + 1) / 2;
        System.out.println(cnt);
    }
}