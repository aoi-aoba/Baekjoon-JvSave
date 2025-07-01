import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, beforeLinearStart = 0, before = 0, N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        sum = before = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == before + 1) before++;
            else {
                before = temp;
                beforeLinearStart = temp;
                sum += beforeLinearStart;
            }
        }
        System.out.println(sum);
        br.close();
    }
}