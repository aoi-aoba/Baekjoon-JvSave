import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_n = Integer.parseInt(st.nextToken()), b_n = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new TreeSet<>(), setB = new TreeSet<>(), res = new TreeSet<>();
        StringTokenizer stForSetA = new StringTokenizer(br.readLine());
        while (stForSetA.hasMoreTokens()) setA.add(Integer.parseInt(stForSetA.nextToken()));
        StringTokenizer stForSetB = new StringTokenizer(br.readLine());
        while (stForSetB.hasMoreTokens()) setB.add(Integer.parseInt(stForSetB.nextToken()));

        for (int i : setA) if (!setB.contains(i)) res.add(i);
        for (int j : setB) if (!setA.contains(j)) res.add(j);

        System.out.println(res.size());
        br.close();
    }
}