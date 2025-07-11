import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    static final BigDecimal TEN = new BigDecimal("10");
    static final BigDecimal EPSILON = new BigDecimal("0.00000001");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        BigDecimal X = new BigDecimal(br.readLine());
        Set<Long> answers = new TreeSet<>(); // 정렬 + 중복방지

        /*
        N이 k자리 자연수이고 첫 자리 숫자가 a이며 나머지 k-1자리의 수를 모두 b라고 하자.
        그러면 앞자리를 이동한 수 M = 10b + a이고 조건에서 XN = 10b + a
        이는 X (a * 10 ^ (k-1) + b) = 10b + a인 것이므로 식을 정리하면 aX * 10^(k-1) + bX = 10b + a
        다시 정리하면 b (X - 10) = a (1 - X * 10 ^ (k-1))이다.
         */

        for (int k = 1; k <= 8; k++) {
            BigDecimal tenPow = TEN.pow(k - 1); // 10^(k-1)

            for (int a = 1; a <= 9; a++) { // 첫 자리 수 1~9
                BigDecimal right = BigDecimal.valueOf(a).multiply(BigDecimal.ONE.subtract(X.multiply(tenPow)));
                BigDecimal left = X.subtract(TEN);
                if (left.abs().compareTo(EPSILON) < 0) continue; // 0으로 나누기 방지
                // b (X - 10) = a (1 - X * 10 ^ (k-1)) 의 좌변과 우변을 활용해, b = right / left 계산. 0 나누기 금지를 위해 if문 추가.

                BigDecimal bCase = right.divide(left, MathContext.DECIMAL128);
                if (bCase.scale() > 0 && bCase.stripTrailingZeros().scale() > 0) continue;
                // scale()을 통해 소수점 아래 자리수를 가져왔더니 0보다 크다거나, 불필요 0을 제거했는데도  0보다 크면 소수니까 제외
                long b = bCase.longValue();
                if (b < 0 || b >= tenPow.longValue()) continue;
                // b는 k자리 수 중에서 앞자리를 제외한 나머지라고 했으므로, 10^(k-1)보다 작아야 함

                long result = a * tenPow.longValue() + b;
                if (result < 100_000_000L) answers.add(result);
            }
        }

        if (answers.isEmpty()) out.append("No solution\n");
        else for (long n : answers) out.append(n).append("\n");
        bw.write(out.toString());
        bw.flush();
    }
}