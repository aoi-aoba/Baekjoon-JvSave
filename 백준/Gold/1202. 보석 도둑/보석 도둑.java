import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static List<int[]> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        PriorityQueue<int[]> jewelAndBag = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                else return o2[1] - o1[1];
            }
        });

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewelAndBag.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        for (int j = 0; j < K; j++)
            jewelAndBag.add(new int[] {Integer.parseInt(br.readLine()), -1});

        PriorityQueue<Integer> values = new PriorityQueue<>(Collections.reverseOrder());
        long result = 0;

        while (!jewelAndBag.isEmpty()) {
            int[] obj = jewelAndBag.poll();
            if (obj[1] != -1) values.offer(obj[1]);
            else if (!values.isEmpty()) result += values.poll();
        }

        System.out.println(result);
    }
}