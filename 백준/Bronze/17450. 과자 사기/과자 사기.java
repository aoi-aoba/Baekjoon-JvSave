import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char snackName[] = {'S', 'N', 'U'}, ans = ' ';
        double efficiency[] = new double[3], best = 0;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken()), weight = Double.parseDouble(st.nextToken());
            price *= 10;
            weight *= 10;
            if (price >= 5000) price -= 500;
            efficiency[i] = weight / price;
            best = Math.max(best, efficiency[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (best == efficiency[i]) {
                ans = snackName[i];
                break;
            }
        }
        System.out.println(ans);
    }
}