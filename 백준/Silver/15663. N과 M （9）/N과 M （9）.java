import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] numbers;
    public static List<Integer> caselist = new ArrayList<>();
    public static List<String> result = new ArrayList<>();

    public static void dfs(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int temp : caselist)
                sb.append(temp).append(" ");
            if (!result.contains(sb.toString()))
                result.add(sb.toString());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (numbers[i] != 0) {
                int temp = numbers[i];
                caselist.add(numbers[i]);
                numbers[i] = 0;
                dfs(depth + 1);
                numbers[i] = temp;
                caselist.remove(caselist.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(numbers);

        dfs(0);
        for (String str : result) out.append(str).append("\n");

        bw.write(out.toString());
        bw.flush();
    }
}