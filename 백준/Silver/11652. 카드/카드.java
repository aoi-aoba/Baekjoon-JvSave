import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long target = Long.parseLong(br.readLine());
            if (hashMap.containsKey(target))
                hashMap.replace(target, hashMap.get(target) + 1);
            else hashMap.put(target, 1);
        }

        List<Long> keySet = new ArrayList<>(hashMap.keySet());
        Collections.sort(keySet, new Comparator<Long>() {
            @Override
            public int compare(Long l1, Long l2) {
                if (hashMap.get(l1).equals(hashMap.get(l2)))
                    return Long.compare(l2, l1);
                else return Integer.compare(hashMap.get(l1), hashMap.get(l2));
            }
        });

        bw.write(String.valueOf(keySet.get(keySet.size() - 1)));
        bw.flush();
    }
}