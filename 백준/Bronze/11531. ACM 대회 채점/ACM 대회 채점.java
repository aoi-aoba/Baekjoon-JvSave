import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int solved = 0, penalty = 0;
        Map<String, Integer> probMap = new HashMap<>();

        while (true) {
            String str = br.readLine();
            if (str.equals("-1")) break;

            StringTokenizer st = new StringTokenizer(str);
            int time = Integer.parseInt(st.nextToken());
            String prob = st.nextToken();
            boolean isRight = st.nextToken().charAt(0) == 'r';

            if (!isRight && probMap.containsKey(prob))
                probMap.replace(prob, probMap.get(prob) + 1);
            else if (!isRight) probMap.put(prob, 1);
            else {
                solved++;
                penalty += time + ((probMap.containsKey(prob)) ? probMap.get(prob) * 20 : 0);
            }
        }

        bw.write(solved + " " + penalty);
        bw.flush();
    }
}