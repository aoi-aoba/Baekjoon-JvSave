import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int[][] seats = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                seats[i][j] = Integer.parseInt(st.nextToken());
        }
        int jinseo = seats[a-1][b-1];
        boolean isHappy = true;
        for (int i = 0; i < N; i++) {
            if (i != a - 1) isHappy = (seats[i][b-1] <= jinseo);
            else for (int j = 0; j < N; j++) {
                if (j == b - 1) continue;
                isHappy = (seats[i][j] <= jinseo);
                if (!isHappy) break;
            }
            if (!isHappy) break;
        }
        System.out.println(isHappy ? "HAPPY" : "ANGRY");
        br.close();
    }
}