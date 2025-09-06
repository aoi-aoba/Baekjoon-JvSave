import java.util.*;
import java.io.*;

public class Main {
    static int n;
    public static int lisLength(ArrayList<Integer> list) {
        int result = 0;
        ArrayList<Integer> lis = new ArrayList<>();
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int pos = Collections.binarySearch(lis, list.get(i));
            if (pos < 0) pos = - (pos + 1);

            if (pos == lis.size()) lis.add(list.get(i));
            else lis.set(pos, list.get(i));
            dp[i] = pos + 1;
        }

        for (int temp : dp) result = Math.max(temp, result);
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
            map.put(from, to);
        }

        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        ArrayList<Integer> valList = new ArrayList<>();
        for (int fromNum : keyList) valList.add(map.get(fromNum));
        System.out.println(n - lisLength(valList));
    }
}