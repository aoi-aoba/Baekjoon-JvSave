import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N, total = 0, result = Integer.MAX_VALUE;
    public static char[] teamTable;
    public static int[] synergySum;
    public static int[][] synergyTable;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        inputConverter();
        tracker(0);
        System.out.println(result);
    }

    public static void inputConverter() throws IOException {
        synergyTable = new int[N][N];
        teamTable = new char[N];
        synergySum = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                synergyTable[i][j] = Integer.parseInt(st.nextToken());
                total += synergyTable[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) sum += synergyTable[i][j] + synergyTable[j][i];
            synergySum[i] = sum;
        }
    }

    public static void tracker(int selectedNum) {
        if (selectedNum == N) {
            int sum = 0;
            for (int i = 0; i < N; i++)
                if (teamTable[i] == 's') sum += synergySum[i];
            result = Math.min(result, Math.abs(total - sum));
            return;
        }
        teamTable[selectedNum] = 's';
        tracker(selectedNum + 1);
        teamTable[selectedNum] = 'l';
        tracker(selectedNum + 1);
    }
}