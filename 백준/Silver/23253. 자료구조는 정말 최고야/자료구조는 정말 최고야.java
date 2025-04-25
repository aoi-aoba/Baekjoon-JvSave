import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        boolean result = true;
        for (int i = 0; i < M; i++) {
            int len = Integer.parseInt(br.readLine());
            StringTokenizer books = new StringTokenizer(br.readLine());
            int init = Integer.parseInt(books.nextToken());
            for (int j = 1; j < len; j++) {
                int temp = Integer.parseInt(books.nextToken());
                if (init < temp) {
                    System.out.println("No");
                    return;
                } else init = temp;
            }
        }
        System.out.println("Yes");
    }
}