import java.io.*;
import java.util.*;

public class Main {
    // 확장 유클리드 알고리즘 : 유클리드 호제법 gcd(a, b) = ax + by의 베주 항등식을 구해 x, y도 구하는 방식
    public static int extendedGCD(int a, int b, int[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        int[] temp = new int[2];
        int gcd = extendedGCD(b, a % b, temp);
        xy[0] = temp[1];
        xy[1] = temp[0] - (a / b) * temp[1];
        return gcd;
    }

    // 선형 합동식 풀이
    public static int solve(int M, int N, int x, int y) {
        int a = M, b = N, c = y - x;
        int[] xy = new int[2];
        // k = x(mod M)이면서 k = y(mod N)이어야 한다
        // 즉, k=x+Mt를 y식에 대입할 때 Mt=y-x (mod N)을 만족하는 최소의 0 이상 t를 구해야 한다
        
        int gcd = extendedGCD(a, b, xy); // 확장 유클리드 알고리즘으로 해 구하기
        
        if (c % gcd != 0) return -1; // (y-x)가 gcd의 배수가 아니라면 해는 없음
        
        int t = (int)(((long)xy[0] * (c / gcd)) % (N / gcd));
        // 그게 아니라면, t = (c / gcd) * (x^-1) mod (N / gcd)를 구하여 k = x + Mt의 t를 구해주고
        if (t < 0) t += N / gcd; // t가 0보다 작다면 N / gcd를 한 번 더해줘서 0보다 크게 만들기
        int year = x + M * t; // 이제 선형 합동식을 그대로 대입해서 연도를 구해주고
        int lcm = M / gcd * N;
        return year > lcm ? -1 : year; // lcm을 넘진 않는지 체크한다
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            int result = solve(M, N, x, y);
            sb.append(result).append('\n');
        }
        System.out.print(sb);
    }
}
