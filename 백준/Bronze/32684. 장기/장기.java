import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] points = {13, 7, 5, 3, 3, 2};
        double sum1 = 0, sum2 = 1.5;

        st = new StringTokenizer(br.readLine());
        for (int point : points) {
            sum1 += point * Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int point : points) {
            sum2 += point * Integer.parseInt(st.nextToken());
        }

        System.out.println(sum1 > sum2 ? "cocjr0208" : "ekwoo");
        br.close();
    }
}