import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long area = Long.valueOf(br.readLine());
        double perimeter = (double) Math.round(Math.sqrt(area * Math.PI) * 2 * 1000000000) / 1000000000;
        System.out.print(perimeter);
    }
}