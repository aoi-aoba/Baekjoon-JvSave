import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine()), soft = 0, embedded = 0, AIDev = 0, none = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken()), classNum = Integer.parseInt(st.nextToken()),
                    studentNum = Integer.parseInt(st.nextToken());
            if (grade == 1) none++;
            else if (classNum == 1 || classNum == 2) soft++;
            else if (classNum == 3) embedded++;
            else AIDev++;
        }

        out.append(soft).append("\n").append(embedded).append("\n").append(AIDev).append("\n").append(none);
        bw.write(out.toString());
        bw.flush();
    }
}