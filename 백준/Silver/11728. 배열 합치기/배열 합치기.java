import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);
        for (int item : list) sb.append(item).append(" ");
        System.out.println(sb);
    }
}