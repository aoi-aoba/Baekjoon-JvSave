import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String L = st.nextToken();
        int num = 1;
        while(N > 0) {
            if(!String.valueOf(num).contains(L)) N--;
            num++;
        }
        System.out.println(num-1);
        br.close();
    }
}