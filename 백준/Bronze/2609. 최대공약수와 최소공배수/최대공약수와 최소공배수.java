import java.io.*;
import java.util.*;

public class Main {
    public static int Euclidean(int a, int b) {
        if(b == 0) return a;
        return Euclidean(b, a % b);
        // 양의 정수 a, b에 대해 a = bq + r이면 gcd(a, b) = gcd(b, r)이며 r = 0이면 최대공약수는 b이다
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int GCD = Euclidean(a, b); // 유클리드 호제법 활용
        int LCM = a * b / GCD; // 최소공배수는 두 수의 곱을 최대공약수로 나눈 값
        System.out.println(GCD);
        System.out.println(LCM);
        br.close();
    }
}