import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int[][] password;
    public static void getPasswordCase(int N) {
        password = new int[N+1][10];
        Arrays.fill(password[1], 1);
        for (int i = 2; i <= N; i++)
            for (int j = 0; j < 10; j++)
                password[i][j] = switch (j) {
                    case 0 -> password[i-1][7] % 1234567;
                    case 1 -> (password[i-1][2] + password[i-1][4]) % 1234567;
                    case 2 -> (password[i-1][1] + password[i-1][3] + password[i-1][5]) % 1234567;
                    case 3 -> (password[i-1][2] + password[i-1][6]) % 1234567;
                    case 4 -> (password[i-1][1] + password[i-1][5] + password[i-1][7]) % 1234567;
                    case 5 -> (password[i-1][2] + password[i-1][4] + password[i-1][6] + password[i-1][8]) % 1234567;
                    case 6 -> (password[i-1][3] + password[i-1][5] + password[i-1][9]) % 1234567;
                    case 7 -> (password[i-1][4] + password[i-1][8] + password[i-1][0]) % 1234567;
                    case 8 -> (password[i-1][5] + password[i-1][7] + password[i-1][9]) % 1234567;
                    case 9 -> (password[i-1][6] + password[i-1][8]) % 1234567;
                    default -> 0;
                };
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()), res = 0;
            if (N == 1) sb.append(10 + "\n");
            else {
                getPasswordCase(N);
                for (int j = 0; j < 10; j++) res += password[N][j];
                sb.append(res%1234567).append("\n");
            }
        }
        System.out.print(sb);
        br.close();
    }
}