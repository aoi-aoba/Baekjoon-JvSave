import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int setANum = Integer.parseInt(st.nextToken()), setBNum = Integer.parseInt(st.nextToken());

        HashSet<Integer> compSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < setANum; i++)
            compSet.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < setBNum; j++) {
            int target = Integer.parseInt(st.nextToken());
            compSet.remove(target);
        }

        sb.append(compSet.size()).append("\n");
        if (!compSet.isEmpty()) {
            List<Integer> list = new ArrayList<>(compSet);
            Collections.sort(list);
            for (int temp : list) sb.append(temp).append(" ");
        }

        System.out.print(sb);
    }
}