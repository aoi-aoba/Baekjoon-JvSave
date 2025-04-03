import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] checkPartialSum(int len, int sum) {
        while(true) {
            double first = (2.0 * sum - len * len + len) / (2.0 * len);
            if(first % 1 == 0.0) {
                if(len > 100 || first < 0) return new int[] {-1};
                else return new int[] {(int)first, len};
            }
            if(first < 1) return new int[] {-1};
            else len++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
        int[] res = checkPartialSum(L, N);
        if(res[0] == -1) System.out.println(-1);
        else for(int i=0; i<res[1]; i++) System.out.print(res[0] + i + " ");
        br.close();
    }
}

// 등차수열의 부분합 공식 : Sn = n * (2 * a + d * (n - 1)) / 2
// 공차가 1로 보존된 상태이므로 : Sn = n * (2 * a + n - 1) / 2
// a에 대하여 정리하면 : a = (2 * Sn - n * n + n) / (2 * n)