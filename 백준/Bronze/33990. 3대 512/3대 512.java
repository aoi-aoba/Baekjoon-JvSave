import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), near = Integer.MAX_VALUE;
        boolean canTakePrize = false;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += Integer.parseInt(st.nextToken());
            if (sum >= 512) {
                canTakePrize = true;
                near = Math.min(near, sum - 512);
            }
        }
        System.out.println(canTakePrize ? 512 + near : -1);
    }
}