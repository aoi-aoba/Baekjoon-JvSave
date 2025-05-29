import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        HashMap<String, String> passwordMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String siteLink = st.nextToken(), password = st.nextToken();
            passwordMap.put(siteLink, password);
        }
        for (int i = 0; i < M; i++) {
            String targetSite = br.readLine();
            sb.append(passwordMap.get(targetSite)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}