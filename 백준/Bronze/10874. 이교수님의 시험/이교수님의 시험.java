import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[10];
        for (int i = 1; i <= 10; i++) answer[i-1] = (i - 1) % 5 + 1;
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == answer[j]) cnt++;
            }
            if (cnt == 10) sb.append(i).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}