import javax.net.ssl.SSLContextSpi;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        sb.append((A+B)%C).append("\n").append(((A%C)+(B%C))%C).append("\n");
        sb.append((A*B)%C).append("\n").append(((A%C)*(B%C))%C);
        System.out.println(sb);
    }
}