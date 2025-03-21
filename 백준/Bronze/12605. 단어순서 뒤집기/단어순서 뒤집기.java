import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            sb.append("Case #").append(i+1).append(": ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<String> list = new ArrayList<>();
            while(st.hasMoreTokens()) { list.add(st.nextToken()); }
            for(int j=list.size()-1; j>=0; j--) {
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}