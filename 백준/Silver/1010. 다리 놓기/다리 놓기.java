import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] Combination = new int[31][31];
    public static void setCombination() {
        Combination[1][0] = 1;
        Combination[1][1] = 1;
        for(int i = 2; i < 31; i++) for(int j = 0; j <= i; j++) {
            if (j == 0 || j == i) Combination[i][j] = 1;
            else Combination[i][j] = Combination[i - 1][j - 1] + Combination[i - 1][j];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        setCombination();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            sb.append(Combination[N][R]).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}