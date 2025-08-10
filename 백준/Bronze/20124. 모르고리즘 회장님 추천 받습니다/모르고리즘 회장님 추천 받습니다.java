import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), maxNum = 0;
        String name = "";
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            int tempNum = Integer.parseInt(st.nextToken());
            if (tempNum > maxNum) {
                maxNum = tempNum;
                name = temp;
            } else if (tempNum == maxNum) {
                name = name.compareTo(temp) < 0 ? name : temp;
            }
        }

        bw.write(String.valueOf(name));
        bw.flush();
    }
}