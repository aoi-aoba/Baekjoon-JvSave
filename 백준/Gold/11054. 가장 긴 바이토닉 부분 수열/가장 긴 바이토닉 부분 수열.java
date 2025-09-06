import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] reverse(int[] arr) {
        int[] rev = new int[n];
        for (int i = 0; i < n; i++)
            rev[i] = arr[n - 1 - i];
        return rev;
    }

    public static int[] lisLength(int[] arr) {
        int[] dp = new int[n];
        ArrayList<Integer> lis = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pos = Collections.binarySearch(lis, arr[i]);
            if (pos < 0) pos = -(pos + 1);
            // Collections.binarySearch는 그 값이 존재한다면 양수, 아니면 -(삽입위치)-1 반환
            // 가령, {1, 2, 4, 5}에서 3을 돌리게 된다면 반환값은 -3으로 나오게 됨
            if (pos == lis.size()) lis.add(arr[i]);
            // pos가 맨 끝이라면 arr[i]가 최장 길이를 1 늘리는 꼬리가 되므로 append
            else lis.set(pos, arr[i]);
            // 맨 끝이 아니라면 그 자리에 원래 있던 값 대신 arr[i]를 저장
            dp[i] = pos + 1;
            // i는 0-based index이므로 1을 더해서 길이를 체크
        }

        return dp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n], reversedArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        reversedArr = reverse(arr);
        int[] increaseDP = lisLength(arr);
        int[] decreaseDP = reverse(lisLength(reversedArr));

        int result = 0;
        for (int i = 0; i < n; i++)
            result = Math.max(result, increaseDP[i] + decreaseDP[i] - 1);
        System.out.println(result);
    }
}