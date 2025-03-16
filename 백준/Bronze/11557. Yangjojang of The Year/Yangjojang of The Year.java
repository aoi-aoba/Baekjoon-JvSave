import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine()), max = 0;
            String str = "";
            for(int j=0; j<N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String tempStr = st.nextToken();
                int tempInt = Integer.parseInt(st.nextToken());
                if(tempInt > max) {
                    str = tempStr;
                    max = tempInt;
                }
            }
            System.out.println(str);
        }
        br.close();
    }
}