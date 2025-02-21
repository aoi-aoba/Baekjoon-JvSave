import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void repeatAppend(char c, int r) {
        for(int i=0; i<r; i++) {
            sb.append(c);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatNum = Integer.parseInt(st.nextToken());
            char repeatChar = st.nextToken().charAt(0);
            repeatAppend(repeatChar, repeatNum);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}