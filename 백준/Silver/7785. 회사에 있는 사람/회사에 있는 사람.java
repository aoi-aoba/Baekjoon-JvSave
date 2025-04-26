import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> hashSet = new HashSet<>();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken(), status = st.nextToken();
            if (!hashSet.contains(name) && status.charAt(0) == 'e') hashSet.add(name);
            else if (status.charAt(0) == 'l') hashSet.remove(name);
        }
        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        for (String str : list) System.out.println(str);
        br.close();
    }
}