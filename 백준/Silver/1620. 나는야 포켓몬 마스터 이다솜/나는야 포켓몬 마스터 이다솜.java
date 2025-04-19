import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        Map<String, String> hashMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String monName = br.readLine();
            hashMap.put(String.valueOf(i), monName);
            hashMap.put(monName, String.valueOf(i));
        }

        while (M-- > 0)
            sb.append(hashMap.get(br.readLine())).append("\n");

        System.out.println(sb);
        br.close();
    }
}