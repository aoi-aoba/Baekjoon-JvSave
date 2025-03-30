import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        int[] arr = {1, 2, 4, 8, 16, 32, 64};
        for (int j : arr) if (N >= j) res = j;
        System.out.println(res);
        br.close();
    }
}
