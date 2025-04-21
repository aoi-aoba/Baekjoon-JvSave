import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 제곱수 여부 확인
    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    // 최소 제곱수 개수 반환 (1 ~ 4)
    public static int minSquares(int n) {
        // 1. n이 제곱수인 경우 → 1개
        if (isPerfectSquare(n)) return 1;

        // 2. 라그랑주 조건: 4^a * (8b + 7) → 무조건 4개
        int temp = n;
        while (temp % 4 == 0) temp /= 4;
        if (temp % 8 == 7) return 4;

        // 3. 두 제곱수의 합으로 표현 가능한 경우 → 2개
        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) return 2;
        }

        // 4. 나머지는 3개
        return 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(minSquares(N));
        br.close();
    }
}