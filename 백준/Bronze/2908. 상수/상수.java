import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        // Use StringBuffer to use reverse method in StringBuffer
        System.out.println(Math.max(A, B));
    }
}