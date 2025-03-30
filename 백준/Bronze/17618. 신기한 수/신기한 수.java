import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isStrangeNumber(int number) {
        int value = number, result = 0;
        while(number > 0) {
            result += number% 10;
            number /= 10;
        } return (value % result == 0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N <= 10) System.out.println(N);
        else {
            int cnt = 10;
            for(int i=11; i<=N; i++) if(isStrangeNumber(i)) cnt++;
            System.out.println(cnt);
        }
        br.close();
    }
}