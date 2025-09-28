import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder res = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 2) res.append("-1");
        else if (N == 3) res.append("2 5 29");
        else if (N == 4) res.append("2 2 3 17");
        else if (N == 5) res.append("2 2 2 3 3");
        else if (N == 6) res.append("2 2 3 3 3 5");
        else if (N % 2 == 1) res.append("2 ".repeat(3)).append("3 ".repeat(N-3));
        else res.append("2 ".repeat(6)).append("3 ".repeat(N-6));
        System.out.println(res);
    }
}