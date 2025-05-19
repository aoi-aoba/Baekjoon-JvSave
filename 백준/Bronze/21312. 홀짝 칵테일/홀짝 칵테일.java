import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        boolean oddA = (A % 2 == 1), oddB = (B % 2 == 1), oddC = (C % 2 == 1);
        if (!oddA && !oddB && !oddC) System.out.println(A * B * C);
        else if (!oddA && !oddB) System.out.println(C);
        else if (!oddA && !oddC) System.out.println(B);
        else if (!oddB && !oddC) System.out.println(A);
        else if (!oddA) System.out.println(B * C);
        else if (!oddB) System.out.println(A * C);
        else if (!oddC) System.out.println(A * B);
        else System.out.println(A * B * C);
    }
}