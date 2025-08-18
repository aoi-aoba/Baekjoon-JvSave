import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> freqMap = new HashMap<>();
        Map<Integer, Integer> startIdxMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (freqMap.containsKey(temp))
                freqMap.put(temp, freqMap.get(temp) + 1);
            else {
                freqMap.put(temp, 1);
                startIdxMap.put(temp, i);
            }
        }

        List<Integer> keyList = new ArrayList<>(freqMap.keySet());
        keyList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer key1, Integer key2) {
                if (freqMap.get(key1).equals(freqMap.get(key2)))
                    return startIdxMap.get(key1) - startIdxMap.get(key2);
                    // 나타난 순서는 첫 인덱스 기준 오름차순 정렬
                else return freqMap.get(key2) - freqMap.get(key1);
                // 빈도는 내림차순 정렬
            }
        });

        for (int num : keyList) {
            for (int i = 0; i < freqMap.get(num); i++)
                sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}