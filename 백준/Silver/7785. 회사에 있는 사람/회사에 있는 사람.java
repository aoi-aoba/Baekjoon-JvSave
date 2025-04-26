import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken(), status = st.nextToken();
            if (!treeSet.contains(name) && status.charAt(0) == 'e') treeSet.add(name);
            else if (status.charAt(0) == 'l') treeSet.remove(name);
        }

        for (String str : treeSet) sb.append(str).append("\n");
        System.out.print(sb);
        br.close();
    }
}