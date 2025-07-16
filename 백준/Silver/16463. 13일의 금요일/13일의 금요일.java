import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;

        int N = Integer.parseInt(br.readLine()), ans = 0, date = 13;
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int year = 2019; year <= N; year++) {
            for (int month = 1; month <= 12; month++) {
                if (date % 7 == 4) result++;
                date += days[month];
                if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) date++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}