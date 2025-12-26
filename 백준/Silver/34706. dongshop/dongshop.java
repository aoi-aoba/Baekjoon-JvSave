//  dongshop

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int x = n + 1 >> 1;
            for (int i = 1; i <= n; i++)
                System.out.println(x + " " + i);
        }
    }
}