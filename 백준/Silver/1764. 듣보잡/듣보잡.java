import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), cnt = 0;

        List<String> unknown = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        while (N-- > 0) hashMap.put(br.readLine(), 1);
        while (M-- > 0) {
            String temp = br.readLine();
            if (hashMap.containsKey(temp)) {
                unknown.add(temp);
                cnt++;
            }
        }

        Collections.sort(unknown);
        sb.append(cnt).append("\n");
        for (String name : unknown) sb.append(name).append("\n");
        System.out.print(sb);
    }
}