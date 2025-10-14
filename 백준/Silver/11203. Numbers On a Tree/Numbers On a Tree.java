import java.io.*;

public class Main {
    public static long pow(long base, long exp) {
        long res = 1;
        for (int i = 0; i < exp; i++)
            res *= base;
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long max = pow(2, Integer.parseInt(input[0]) + 1) - 1;
        int idx = 1;
        if (input.length != 1) {
            char[] path = input[1].toCharArray();
            for (char ch : path)
                idx = idx * 2 + (ch == 'R' ? 1 : 0);
        }

        System.out.println(max - idx + 1);
    }
}
