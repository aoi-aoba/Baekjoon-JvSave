import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_n = Integer.parseInt(st.nextToken()), b_n = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>(), setB = new HashSet<>();
        StringTokenizer stSetA = new StringTokenizer(br.readLine());
        while (stSetA.hasMoreTokens()) setA.add(Integer.parseInt(stSetA.nextToken()));
        StringTokenizer stSetB = new StringTokenizer(br.readLine());
        while (stSetB.hasMoreTokens()) setB.add(Integer.parseInt(stSetB.nextToken()));
        setA.retainAll(setB);

        System.out.println(a_n + b_n - 2 * setA.size());
        br.close();
    }
}
