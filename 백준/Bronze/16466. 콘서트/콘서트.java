import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);

        int cnt = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != cnt) break;
            else cnt++;
        }

        System.out.println(cnt);
    }
}