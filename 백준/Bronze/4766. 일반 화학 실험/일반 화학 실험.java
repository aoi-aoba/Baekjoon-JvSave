import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double init = Double.parseDouble(br.readLine());
        while (true) {
            double now = Double.parseDouble(br.readLine());
            if (now == 999) break;
            System.out.printf("%.2f\n", now - init);
            init = now;
        }
        br.close();
    }
}