import java.io.*;
import java.util.*;

public class Main {
    public static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ds = read(), ys = read(), dm = read(), ym = read(), s = ys-ds, m = ym-dm;
        while(s != m) {
            if(s < m) s += ys;
            else m += ym;
        }
        System.out.println(s);
        br.close();
    }
}