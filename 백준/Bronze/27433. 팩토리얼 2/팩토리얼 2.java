import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long res = 1;
        long N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++)
            res *= i;
        System.out.println(res);
    }
}