import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p = (n % 8 == 0) ? n/8-1 : n/8;
        char q = (char)('a' + (n % 8 == 0 ? 7 : n % 8 - 1));
        System.out.print(q+""+(p+1));
        br.close();
    }
}