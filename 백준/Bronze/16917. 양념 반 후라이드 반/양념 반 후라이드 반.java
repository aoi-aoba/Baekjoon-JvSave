import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()),
                Y = Integer.parseInt(st.nextToken());

        int Z = Math.min(X, Y); // 후라이드와 양념 중 더 적은 것 (그러면 공통개수가 나옴)
        int min = Math.max(X, Y) * 2 * C;
        for(int i=0; i<=Z; i++) {
            int price = C * 2 * i + A * (X - i) + B * (Y - i);
            min = Math.min(min, price);
            // 반반치킨으로 Z마리 맞추려면 2Z 구매, 그걸 제외하고 양념 X-Z마리, 후라이드 Y-Z마리
        }

        System.out.println(min);
        br.close();
    }
}