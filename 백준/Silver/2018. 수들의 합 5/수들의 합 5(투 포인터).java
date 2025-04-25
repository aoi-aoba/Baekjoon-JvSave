import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int stIdx = 1, enIdx = 1, sum = 1, cnt = 1;
        while (enIdx != n) {
            if (sum == n) {
                cnt++;
                enIdx++;
                sum += enIdx;
            } else if (sum > n) {
                sum -= stIdx;
                stIdx++;
            } else {
                enIdx++;
                sum += enIdx;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
