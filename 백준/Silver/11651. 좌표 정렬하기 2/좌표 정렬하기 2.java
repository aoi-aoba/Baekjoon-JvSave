import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] positions = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            positions[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        Arrays.sort(positions, new Comparator<int[]>() {
            @Override
            public int compare(int[] pos1, int[] pos2) {
                if (pos1[1] != pos2[1]) return Integer.compare(pos1[1], pos2[1]);
                else return Integer.compare(pos1[0], pos2[0]);
            }
        });
        for (int[] pos : positions) sb.append(pos[0]).append(" ").append(pos[1]).append("\n");
        System.out.print(sb);
        br.close();
    }
}