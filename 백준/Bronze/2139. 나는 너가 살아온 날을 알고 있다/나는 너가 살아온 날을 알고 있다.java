import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y = -1, m = -1, d = -1, sum = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if ((d + m + y) == 0) break;
            boolean isLeapYear = (y % 4 == 0) && !(y % 100 == 0 && y % 400 != 0);

            sum = d;
            for(int i = 0; i < m - 1; ++i) {
                if(i == 1 && isLeapYear) sum += 29;
                else sum += days[i];
            }
            System.out.println(sum);
        }
        br.close();
    }
}