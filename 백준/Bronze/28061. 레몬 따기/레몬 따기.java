import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), mx = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(Integer.parseInt(st.nextToken()));
        for (int i = 0; i < N; i++) if (list.get(i) - (N - i) >= mx) mx = list.get(i) - (N - i);
        System.out.println(mx);
        br.close();
    }
}