import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken()), res = 0;

        A %= B; // A의 초기값을 세팅 (자연수 범위는 필요가 없으니까)
        for(int i=1; i<=N; i++) {
            A *= 10;
            if(i == N) res = A / B;
            else A %= B;
        }

        System.out.println(res);
    }
}