import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int friendStdMax = K + X;
        int friendStdMin = K - X;

        if(A > friendStdMax || B < friendStdMin) {
            System.out.println("IMPOSSIBLE");
        } else if(friendStdMax == A || B == friendStdMin) {
            System.out.println(1);
        } else {
            System.out.println(Math.min(friendStdMax, B) - Math.max(friendStdMin, A) + 1);
        }
    }
}