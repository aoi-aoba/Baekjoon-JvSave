import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++)
            hashMap.put(Integer.parseInt(st.nextToken()), i);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            if (hashMap.containsKey(Integer.parseInt(st.nextToken())))
                sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}