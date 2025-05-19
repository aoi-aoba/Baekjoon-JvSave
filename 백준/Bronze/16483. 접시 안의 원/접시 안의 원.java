import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        double res = (input / 2.0) * (input / 2.0);
        System.out.println((int) res);
    }
}