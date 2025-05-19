import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), T = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int p1 = a * Integer.parseInt(st.nextToken()) + b * Integer.parseInt(st.nextToken()) + c * Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int p2 = a * Integer.parseInt(st.nextToken()) + b * Integer.parseInt(st.nextToken()) + c * Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int p3 = a * Integer.parseInt(st.nextToken()) + b * Integer.parseInt(st.nextToken()) + c * Integer.parseInt(st.nextToken());
            int sum = p1 + p2 + p3;
            max = Math.max(sum, max);
        }

        System.out.println(max);

    }
}