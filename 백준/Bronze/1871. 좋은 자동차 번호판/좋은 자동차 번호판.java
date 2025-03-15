import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");
            String forward = st.nextToken();
            int forwardToNum = (forward.charAt(0) - 'A') * 26 * 26 + (forward.charAt(1) - 'A') * 26 + (forward.charAt(2) - 'A');
            int backward = Integer.parseInt(st.nextToken());
            if(Math.abs(forwardToNum - backward) <= 100) System.out.println("nice");
            else System.out.println("not nice");
        }
        br.close();
    }
}