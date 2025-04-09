import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int getBetweenDays(int month, int day) {
        int res = 0;
        int[] arr = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month != 1) for(int i = 1; i < month; i++) res += arr[i];
        if(day != 1) res += day - 1;
        return res;
    }
    public static String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken()), month = Integer.parseInt(st.nextToken());
        if(day == 1 && month == 1) System.out.println("Thursday");
        else {
            int betweenDays = getBetweenDays(month, day);
            System.out.println(days[betweenDays % 7]);
        }
        br.close();
    }
}