import java.util.*;
import java.io.*;

public class Main {
    public static long func(long A, long B) {
        return (A + B) * (A - B);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.println(func(A, B));
    }
}