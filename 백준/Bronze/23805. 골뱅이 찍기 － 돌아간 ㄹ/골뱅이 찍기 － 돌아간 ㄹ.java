import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) System.out.println("@".repeat(3*N) + " ".repeat(N) + "@".repeat(N));
        for (int i = 0; i < 3*N; i++) System.out.println("@".repeat(N) + " ".repeat(N) + "@".repeat(N) + " ".repeat(N) + "@".repeat(N));
        for (int i = 0; i < N; i++) System.out.println("@".repeat(N) + " ".repeat(N) + "@".repeat(3*N));
    }
}