import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int res = 0;

        if(A == B && B == C) res = 10000 + A * 1000;
        else if(A == B || B == C || C == A) {
            if(A == B) res = 1000 + A * 100;
            else if(B == C) res = 1000 + B * 100;
            else res = 1000 + C * 100;
        }
        else {
            if(A > B && A > C) res = 100 * A;
            else if(B > A && B > C) res = 100 * B;
            else res = 100 * C;
        }

        System.out.println(res);
    }
}