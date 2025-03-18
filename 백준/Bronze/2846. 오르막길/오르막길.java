import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken()), size = 0, maxSize = 0;
        for(int i=1; i<T; i++) {
            int now = Integer.parseInt(st.nextToken());
            if(now > prev) size += now - prev;
            else {
                if(maxSize < size) maxSize = size;
                size = 0;
            }
            prev = now;
        }
        if(maxSize < size) maxSize = size;
        System.out.println(maxSize);
        br.close();
    }
}