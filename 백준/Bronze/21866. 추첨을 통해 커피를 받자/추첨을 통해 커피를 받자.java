import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[] {100, 100, 200, 200, 300, 300, 400, 400, 500};
        boolean isHacker = false, getCoffee = false;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp > arr[i]) {
                isHacker = true;
                break;
            }
            sum += temp;
            if (sum >= 100) {
                getCoffee = true;
                break;
            }
        }
        System.out.println(isHacker ? "hacker" : getCoffee ? "draw" : "none");
        br.close();
    }
}