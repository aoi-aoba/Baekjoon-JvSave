import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = 1, end = 0, pos = 0, p = 1, q = 1;
        while(true) {
            end += n;
            if(x > end) {
                n++;
            } else break;
        }
        pos = end - x;
        if(pos == 0) {
            if (n % 2 == 0) System.out.println(n + "/" + 1);
            else System.out.println(1 + "/" + n);
        } else {
            if (n % 2 == 0) {
                p = n - pos;
                q = 1 + pos;
            } else {
                p = 1 + pos;
                q = n - pos;
            }
            System.out.println(p + "/" + q);
        }
    }
}