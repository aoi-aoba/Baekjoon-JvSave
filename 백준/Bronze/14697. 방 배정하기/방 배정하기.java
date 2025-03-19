import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        for(int i=0; i<300; i++) {
            for (int j = 0; j < 150; j++)
                for (int k = 0; k < 100; k++)
                    if (A * i + B * j + C * k == N) {
                        System.out.println(1);
                        return;
                    }
        }
        System.out.println(0);
        br.close();
    }
}