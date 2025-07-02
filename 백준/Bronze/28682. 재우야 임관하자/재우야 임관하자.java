import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lectures = {"swimming", "bowling", "soccer"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < lectures.length; i++) map.put(lectures[i], i);
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) bw.append(lectures[0]).append(" ");
        bw.append("\n");
        bw.flush();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String failed = st.nextToken();
            int index = map.get(failed) == 1 ? 2 : 1;
            bw.append(lectures[index]).append(" ");
        }
        bw.close();
        br.close();;
    }
}