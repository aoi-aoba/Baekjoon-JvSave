import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 계획의 수
        int sumTime = (n - 1) * 8; // 총 쉬는 시간은 계획의 수 - 1이다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sumTime += Integer.parseInt(st.nextToken());
        }

        sb.append(sumTime / 24).append(" ").append(sumTime % 24);
        System.out.print(sb);
    }
}