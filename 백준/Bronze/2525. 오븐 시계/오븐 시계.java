import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        B += C;
        while (B >= 60) {
            B -= 60;
            A += 1;
        }
        if (A >= 24) A -= 24;
        System.out.println(A + " " + B);
    }
}