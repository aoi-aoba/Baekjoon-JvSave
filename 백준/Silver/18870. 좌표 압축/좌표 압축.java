import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()), depressedRank = 0;
        int[] originArr = new int[N], sortedArr = new int[N];
        Map<Integer, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            originArr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(sortedArr);

        for (int i = 0; i < N; i++)
            if (!hashMap.containsKey(sortedArr[i]))
                hashMap.put(sortedArr[i], depressedRank++);

        for (int num : originArr)
            sb.append(hashMap.get(num)).append(" ");

        System.out.println(sb);
    }
}