import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int binarySearch(String[] stringArray, String target) {
        int begin = 0, end = stringArray.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (target.equals(stringArray[mid])) return mid;
            else if (target.compareTo(stringArray[mid]) < 0) end = mid - 1;
            else begin = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), cnt = 0;
        String[] input = new String[N];
        for (int i = 0; i < N; i++) input[i] = br.readLine();
        Arrays.sort(input);
        for (int i = 0; i < M; i++)
            if (binarySearch(input, br.readLine()) >= 0) cnt++;
        System.out.println(cnt);
        br.close();
    }
}