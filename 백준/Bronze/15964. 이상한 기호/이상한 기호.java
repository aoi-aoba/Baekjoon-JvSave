import java.util.*;
import java.io.*;

public class Main {
    public static int func(int A, int B) {
        return (A + B) * (A - B);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(func(A, B));
    }
}