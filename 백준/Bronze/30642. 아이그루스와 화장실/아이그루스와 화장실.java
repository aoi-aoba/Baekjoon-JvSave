import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine()), type = input.readLine().equals("annyong") ? 0 : 1, k = Integer.parseInt(input.readLine());
        if (type == 0) System.out.println(k % 2 == 1 ? k : k - 1);
        else System.out.println(k % 2 == 0 ? k : k == 1 ? 2 : k - 1);
    }
}