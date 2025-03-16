import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double init = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                switch (str) {
                    case "@" -> init *= 3.0;
                    case "%" -> init += 5.0;
                    case "#" -> init -= 7.0;
                }
            }
            System.out.printf("%.2f\n", init);
        }
        br.close();
    }
}