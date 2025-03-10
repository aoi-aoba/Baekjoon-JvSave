import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            sb.append(str.charAt(0));
        }
        System.out.println(sb);
    }
}