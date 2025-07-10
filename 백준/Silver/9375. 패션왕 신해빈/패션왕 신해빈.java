import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()), result = 1;
            if (N == 0) {
                out.append(0).append("\n");
                continue;
            }
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken(), type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
            for (int count : map.values()) result *= (count + 1);
            out.append(result == 1 ? 1 : result - 1).append("\n");
        }
        bw.write(out.toString());
        bw.flush();
    }
}