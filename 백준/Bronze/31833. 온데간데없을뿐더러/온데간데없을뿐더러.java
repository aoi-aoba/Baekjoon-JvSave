import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < N; i++) a.append(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < N; i++) b.append(st.nextToken());
        System.out.println(Math.min(Long.parseLong(a.toString()), Long.parseLong(b.toString())));
    }
}