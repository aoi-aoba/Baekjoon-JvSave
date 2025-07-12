import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> presentsMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) presentsMaxHeap.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        List<Integer> childList = new ArrayList<>();
        for (int i = 0; i < m; i++) childList.add(Integer.parseInt(st.nextToken()));

        for (int temp : childList) {
            int maxBox = 0;
            if (!presentsMaxHeap.isEmpty()) {
                maxBox = presentsMaxHeap.poll();
                if (maxBox > temp) presentsMaxHeap.add(maxBox - temp);
                else if (maxBox == temp) continue;
                else {
                    bw.write(String.valueOf(0));
                    bw.flush();
                    return;
                }
            } else {
                bw.write(String.valueOf(0));
                bw.flush();
                return;
            }
        }

        bw.write(String.valueOf(1));
        bw.flush();
    }
}