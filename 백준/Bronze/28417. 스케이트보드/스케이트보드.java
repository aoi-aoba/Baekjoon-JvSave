import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int run1 = Integer.parseInt(st.nextToken()), run2 = Integer.parseInt(st.nextToken());
            int[] trick = new int[5];
            for (int j = 0; j < 5; j++) trick[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(trick);
            list.add(trick[4] + trick[3] + Math.max(run1, run2));
        }
        Collections.sort(list);
        System.out.println(list.get(N - 1));
    }
}