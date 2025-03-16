import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken(), b = st.nextToken();
        int min_a = Integer.parseInt(a.replace('6', '5'));
        int min_b = Integer.parseInt(b.replace('6', '5'));
        int max_a = Integer.parseInt(a.replace('5', '6'));
        int max_b = Integer.parseInt(b.replace('5', '6'));
        System.out.println((min_a + min_b) + " " + (max_a + max_b));
        br.close();
    }
}