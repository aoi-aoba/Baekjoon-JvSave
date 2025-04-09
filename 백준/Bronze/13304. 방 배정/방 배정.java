import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        int[][] room = new int[4][2];
        int result = 0, year = 0, sexual = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sexual = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
            year = (year <= 2) ? 1 : (year <= 4) ? 2 : 3;
            room[year][sexual]++;
        }

        result += (room[1][0] + room[1][1]) % K == 0 ? (room[1][0] + room[1][1]) / K : (room[1][0] + room[1][1]) / K + 1;
        for (int i = 2; i < 4; i++)
            for (int j = 0; j < 2; j++)
                result += (room[i][j] % K == 0) ? room[i][j] / K : room[i][j] / K + 1;

        System.out.println(result);
        br.close();
    }
}