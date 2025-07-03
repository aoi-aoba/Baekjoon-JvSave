import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static int zeroCount = 0;

    public static int find(int n) {
        int start = 0, max = 0;
        for (int end = 0; end < list.size(); end++) {
            // 현재 윈도우에서 필요한 연속된 숫자의 개수
            int expectedLength = list.get(end) - list.get(start) + 1;
            int actualCount = end - start + 1;

            // 빠진 숫자 개수 = 필요한 길이 - 실제 카드 수
            while (expectedLength - actualCount > zeroCount) {
                start++;
                expectedLength = list.get(end) - list.get(start) + 1;
                actualCount = end - start + 1;
            }

            // 만들 수 있는 최대 연속 길이 = 실제 수 + 백지 카드 수
            max = Math.max(max, actualCount + zeroCount);
        }

        // 연속 길이 최대값은 전체 카드 수 n을 넘을 수 없음
        return Math.min(n, max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) zeroCount++;
            else list.add(temp);
        }
        Collections.sort(list);
        System.out.println(find(n));
    }
}