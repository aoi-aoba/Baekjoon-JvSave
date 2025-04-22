import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal x = new BigDecimal(Integer.parseInt(st.nextToken()));
        BigDecimal y = new BigDecimal(Integer.parseInt(st.nextToken()));
        BigDecimal p = y.multiply(BigDecimal.valueOf(100)).divide(x, 10, RoundingMode.DOWN);
        if (p.compareTo(BigDecimal.valueOf(99)) >= 0) System.out.println(-1);
        else {
            int intP = p.intValue() + 1;
            BigDecimal numerator = x.multiply(BigDecimal.valueOf(intP)).subtract(y.multiply(BigDecimal.valueOf(100)));
            int denominator = 100 - intP;
            BigDecimal leastN = numerator.divide(BigDecimal.valueOf(denominator), 10, RoundingMode.DOWN);
            if (numerator.intValue() % denominator == 0) System.out.println(leastN.intValue());
            else System.out.println(leastN.intValue()+1);
        }
        br.close();
    }
}