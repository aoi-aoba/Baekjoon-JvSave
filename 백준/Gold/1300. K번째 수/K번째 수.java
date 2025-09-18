import java.io.*;

public class Main {
    public static long count(long target, int range) {
        long cnt = 0;
        for (int i = 1; i <= range; i++)
            cnt += Math.min(range, target / i);
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long k = Long.parseLong(br.readLine()), left = 1, right = (long)n * n;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (count(mid, n) < k) {
                left = mid + 1;
            } else right = mid - 1;
        }

        System.out.println(left);
    }
}