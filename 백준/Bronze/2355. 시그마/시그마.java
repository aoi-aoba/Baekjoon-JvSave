import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        if (B > A) {
            long temp = B;
            B = A;
            A = temp;
        }
        long ans = (A + B) * (A - B + 1) / 2;
        System.out.println(ans);
        br.close();
    }
}

// 등차수열의 합 S = (초항+끝항)*(항 개수)/2 이므로, S = (A+B)*(A-B+1)/2가 성립