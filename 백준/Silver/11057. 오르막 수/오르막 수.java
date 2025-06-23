import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int[][] ascentNum;
    public static int findAscentNum(int n) {
        if (n == 1) return 10;
        ascentNum = new int[n + 1][10]; // ascentNum[n][p] = n자리 오르막 수 + 끝이 p
        Arrays.fill(ascentNum[1], 1);
        for (int i = 2; i <= n; i++)
            for (int j = 0; j < 10; j++) // 마지막 자리에 붙일 숫자를 j로서 지정하고
                for (int k = 0; k <= j; k++) // 그 이전 자리가 마지막에 붙일 숫자 이하인 경우만
                    ascentNum[i][j] += (ascentNum[i-1][k] % 10007);
        int result = 0;
        for (int i = 0; i < 10; i++)
            result += ascentNum[n][i];
        return result % 10007;
    }
    /*
        자릿수를 한 자리 늘려가면서 한 자리 적었던 숫자에 대해 그 수의 마지막 자리보다 큰 숫자를 붙인다
        만약 3자리 숫자를 만들며 4를 붙이려 한다면, 2자리 숫자의 끝이 0~3인 숫자 뒤에 붙일 수 있게 되는 것
        마지막   0   1   2   3  4  5   6  7  8   9
        ------------------------------------
        1자리     1	1	1	1	1	1	1	1	1	1
        2자리     1	2	3	4	5	6	7	8	9	10
        3자리     1	3	6	10	15	21	28	36	45	55
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(findAscentNum(N));
        br.close();
    }
}
