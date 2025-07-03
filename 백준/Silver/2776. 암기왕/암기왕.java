import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer lineInput;
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            HashSet<Integer> numSet = new HashSet<>();
            lineInput = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) numSet.add(Integer.parseInt(lineInput.nextToken()));
            int M = Integer.parseInt(br.readLine());
            lineInput = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) output.append(numSet.contains(Integer.parseInt(lineInput.nextToken())) ? 1 : 0).append("\n");
        }

        System.out.print(output);
    }
}