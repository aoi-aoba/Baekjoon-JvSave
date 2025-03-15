import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()), cnt = 0;
        boolean[] arr = new boolean[C + 1];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            for (int j = temp; j <= C; j += temp) arr[j] = true;
        }
        for (int i = 0; i <= C; i++)
            if (arr[i]) cnt++;
        System.out.println(cnt);
        br.close();
    }
}