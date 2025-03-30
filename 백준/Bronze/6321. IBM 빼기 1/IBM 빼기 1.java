import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            char[] str = br.readLine().toCharArray();
            sb.append("String #").append(i + 1).append("\n");
            for(char c : str) {
                if(c == 'Z') sb.append('A');
                else sb.append((char)(c+1));
            }
            if(i != T-1) sb.append("\n").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}