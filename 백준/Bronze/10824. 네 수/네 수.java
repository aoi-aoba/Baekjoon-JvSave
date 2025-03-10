import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken(), B = st.nextToken();
        long connectAB = Long.parseLong(A + B);
        String C = st.nextToken(), D = st.nextToken();
        long connectCD = Long.parseLong(C + D);
        System.out.println(connectAB + connectCD);
        br.close();
    }
}