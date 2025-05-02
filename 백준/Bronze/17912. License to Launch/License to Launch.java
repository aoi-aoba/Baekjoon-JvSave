import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lowJunk = 100001, lowIndex = N + 1;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (lowJunk > temp) {
                lowJunk = temp;
                lowIndex = i;
            }
        }
        System.out.println(lowIndex);
        br.close();
    }
}