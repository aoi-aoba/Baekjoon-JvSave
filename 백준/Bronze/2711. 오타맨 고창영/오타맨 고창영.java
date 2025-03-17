import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int misspellPlace = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder(st.nextToken()).deleteCharAt(misspellPlace-1);
            System.out.println(sb.toString());
        }
        br.close();
    }
}