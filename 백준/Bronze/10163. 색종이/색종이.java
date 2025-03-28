import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[101][101];
        for(int tc = 1; tc <= N; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
            for(int i = a; i < a+c; i++)
                for(int j = b; j < b+d; j++)
                    map[i][j] = tc;
        }
        for(int rep = 1; rep <= N; rep++) {
            int count = 0;
            for(int i = 0; i < 101; i++)
                for(int j = 0; j < 101; j++)
                    if(map[i][j] == rep) count++;
            System.out.println(count);
        }
        br.close();
    }
}