//  Contact

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().strip();
            System.out.println(s.matches("(100+1+|01)+") ? "YES" : "NO");
        }
    }
}