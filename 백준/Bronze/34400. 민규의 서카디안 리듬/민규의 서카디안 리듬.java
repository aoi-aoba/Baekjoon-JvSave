import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            double t = Double.parseDouble(br.readLine());
            if ((t + 0.5) % 25 < 17) System.out.println("ONLINE");
            else System.out.println("OFFLINE");
        }
    }
}