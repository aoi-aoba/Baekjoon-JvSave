import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), minLen = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> dict = new HashMap<>();
        ArrayList<String> dictList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String target = br.readLine();
            if (target.length() >= minLen && !dict.containsKey(target)) {
                dict.put(target, 1);
                dictList.add(target);
            } else if (target.length() >= minLen && dict.containsKey(target))
                dict.replace(target, dict.get(target) + 1);
        }
        dictList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (!dict.get(s1).equals(dict.get(s2)))
                    return Integer.compare(dict.get(s2), dict.get(s1));
                else if (s1.length() != s2.length())
                    return (s1.length() > s2.length()) ? -1 : 1;
                else return s1.compareTo(s2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String temp : dictList) sb.append(temp).append("\n");
        System.out.print(sb);
    }
}