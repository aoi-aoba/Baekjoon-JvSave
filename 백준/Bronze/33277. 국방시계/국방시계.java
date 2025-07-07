import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer token = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(token.nextToken()), m = Integer.parseInt(token.nextToken());
        double minute = 1440.0 * m / n;
        if (n == m) output.append(24);
        else output.append((int)(minute / 60 / 10)).append((int)(minute / 60 % 10));
        output.append(":").append((int)(minute % 60 / 10)).append((int)(minute % 60 % 10));
        System.out.print(output);
    }
}