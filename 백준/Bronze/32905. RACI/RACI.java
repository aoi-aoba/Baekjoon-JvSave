import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        boolean flag = true;

        for(int i=0; i<n; i++) {
            int cnt = 0;
            String str = br.readLine();
            for(int j=0; j<str.length(); j++)
                if(str.charAt(j) == 'A') cnt++;
            if(cnt != 1) flag = false;
        }

        System.out.println(flag ? "Yes" : "No");
        br.close();
    }
}