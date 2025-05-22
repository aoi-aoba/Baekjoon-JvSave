import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static boolean[] numbers;
    public static void prime() {
        numbers = new boolean[1000001];
        Arrays.fill(numbers, true);
        for (int i = 2; i < numbers.length; i++) {
            if (!numbers[i]) continue;
            for (int j = 2 * i; j < numbers.length; j+=i) numbers[j] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        prime();
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;
            for (int i = 3; i <= input / 2; i += 2) {
                if (numbers[i] && numbers[input - i]) {
                    sb.append(input).append(" = ").append(i).append(" + ").append(input - i).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}