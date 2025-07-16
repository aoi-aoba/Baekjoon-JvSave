import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        for (int i = 1; i < 50; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
                if (list.size() == 1001) break;
            }
            if (list.size() == 1001) break;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = a; i <= b; i++)
            result += list.get(i);

        bw.write(String.valueOf(result));
        bw.flush();
    }
}