import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (N % 2 == 1) System.out.println(0);
        else {
            if (N * (N + 1) / 2 % 2 == 1) System.out.println(1);
            else System.out.println(2);
        }
        br.close();
    }
}