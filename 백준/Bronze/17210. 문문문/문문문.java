import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()), first = Integer.parseInt(br.readLine());
        if (N >= 6) System.out.println("Love is open door");
        else {
            if (first == 0)
                for (int i = 2; i <= N; i++)
                    System.out.println(i % 2 == 0 ? 1 : 0);
            else
                for (int i = 2; i <= N; i++)
                    System.out.println(i % 2 == 0 ? 0 : 1);
        }
        br.close();
    }
}