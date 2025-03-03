import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            sb.append("Data set: ").append(num1).append(" ").append(num2).append(" ").append(cnt).append("\n");
            for(int j = 0; j < cnt; j++) {
                if(num1 > num2) num1 = num1 / 2;
                else num2 = num2 / 2;
            }
            sb.append(Math.max(num1, num2)).append(" ");
            sb.append(Math.min(num1, num2)).append("\n\n");
        }
        System.out.print(sb);
        br.close();
    }
}