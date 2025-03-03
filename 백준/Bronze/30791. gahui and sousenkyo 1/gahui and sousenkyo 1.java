import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int cnt = 0;
        if(a - 1000 <= b) cnt++;
        if(a - 1000 <= c) cnt++;
        if(a - 1000 <= d) cnt++;
        if(a - 1000 <= e) cnt++;
        System.out.println(cnt);
        br.close();
    }
}