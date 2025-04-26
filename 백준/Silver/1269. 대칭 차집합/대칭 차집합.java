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

        Set<Integer> res = new TreeSet<>();
        StringTokenizer stSetA = new StringTokenizer(br.readLine());
        while (stSetA.hasMoreTokens()) res.add(Integer.parseInt(stSetA.nextToken()));
        StringTokenizer stSetB = new StringTokenizer(br.readLine());
        while (stSetB.hasMoreTokens()) {
            int temp = Integer.parseInt(stSetB.nextToken());
            if (res.contains(temp)) res.remove(temp);
            else res.add(temp);
        }

        System.out.println(res.size());
        br.close();
    }
}