import java.util.*;
import java.io.*;

public class Main {
    public static long result = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> salaryList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) salaryList.add(Integer.parseInt(st.nextToken()));

        int startIdx = 0, endIdx = 0, partLen = 1;
        long partSum = (long) salaryList.get(0);

        while (endIdx != n - 1 && startIdx != n - 1) {
            if (endIdx < n - 1 && partLen < m) {
                endIdx++;
                partLen++;
                partSum += salaryList.get(endIdx);
            } else if (startIdx < n - 1 && partLen == m) {
                partSum -= salaryList.get(startIdx);
                startIdx++;
                partLen--;
            } else if (endIdx == n - 1) startIdx++;
            result = Math.max(partSum, result);
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}