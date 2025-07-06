import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int n = Integer.parseInt(input.readLine());
        while (n-- > 0) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            int start = Integer.parseInt(token.nextToken()), end = Integer.parseInt(token.nextToken());
            int inner = (end - start + 43) % 43, outer = (start - end + 43) % 43;
            output.append(inner < outer ? "Inner circle line\n" : inner > outer ? "Outer circle line\n" : "Same\n");
        }
        System.out.print(output);
    }
}