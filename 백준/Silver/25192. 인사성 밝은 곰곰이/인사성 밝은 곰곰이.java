import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0, N = Integer.parseInt(br.readLine());
        HashSet<String> chatUsers = new HashSet<>();
        br.readLine(); // 첫 ENTER 버리기
        for (int i = 1; i < N; i++) {
            String str = br.readLine();
            if (!str.equals("ENTER")) {
                if (!chatUsers.contains(str)) {
                    cnt++;
                    chatUsers.add(str);
                }
            } else chatUsers = new HashSet<>();
        }

        System.out.println(cnt);
        br.close();
    }
}