import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), maxFive = n / 5, res = -1;
        if (maxFive == 0) {
            if (n % 2 == 0) res = n / 2;
        } else {
            int[] arr = new int[maxFive + 1];
            for (int i = maxFive; i >= 0; i--) {
                if((n - 5 * i) % 2 == 0) arr[i] = i + (n - 5 * i) / 2;
                else arr[i] = -1;
            }
            int min = 100000;
            for (int i : arr)
                if (i != -1) min = Math.min(i, min);
            res = min;
        }
        System.out.println(res);
        br.close();
    }
}