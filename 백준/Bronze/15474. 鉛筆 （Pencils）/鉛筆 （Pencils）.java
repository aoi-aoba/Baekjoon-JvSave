import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int setX = ((N % A == 0) ? N / A : N / A + 1) * B;
        int setY = ((N % C == 0) ? N / C : N / C + 1) * D;
        System.out.println(Math.min(setX, setY));
        br.close();
    }
}