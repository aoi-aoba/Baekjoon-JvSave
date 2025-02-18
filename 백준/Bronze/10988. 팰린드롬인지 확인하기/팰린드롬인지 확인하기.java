import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s_rev = new StringBuffer(s).reverse().toString();
        System.out.println(s.equals(s_rev) ? 1 : 0);
    }
}