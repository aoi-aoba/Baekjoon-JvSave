import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int tests = Integer.parseInt(br.readLine());
        for (int i = 0; i < tests; i++) {
            StringTokenizer liner = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(liner.nextToken()), m = Integer.parseInt(liner.nextToken()),
                    freezeTimeMax = Integer.parseInt(liner.nextToken());
            int[] arr = new int[n];
            liner = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(liner.nextToken());
                if (arr[j] != -1) freezeTimeMax = Math.max(freezeTimeMax, m - arr[j]);
            }
            output.append("The scoreboard has been frozen with ").append(freezeTimeMax).
                    append(freezeTimeMax == 1 ? " minute" : " minutes").append(" remaining.\n");
        }
        System.out.print(output);
    }
}