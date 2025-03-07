import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String str = br.readLine();
            int streak = 0, score = 0;
            for(int j=0; j<str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    streak++;
                    score += streak;
                } else streak = 0;
            }
            sb.append(score).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}