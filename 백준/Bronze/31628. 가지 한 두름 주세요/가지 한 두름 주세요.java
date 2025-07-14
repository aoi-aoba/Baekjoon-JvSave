import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++)
                arr[i][j] = st.nextToken();
        }

        for (int i = 0; i < 10; i++) {
            boolean lineRes = true;
            for (int j = 1; j < 10; j++)
                if (!arr[i][j].equals(arr[i][j-1])) {
                    lineRes = false;
                    break;
                }
            if (!lineRes) continue;
            else {
                bw.write(String.valueOf(1));
                bw.flush();
                return;
            }
        }

        for (int j = 0; j < 10; j++) {
            boolean lineRes = true;
            for (int i = 1; i < 10; i++)
                if (!arr[i-1][j].equals(arr[i][j])) {
                    lineRes = false;
                    break;
                }
            if (!lineRes) continue;
            else {
                bw.write(String.valueOf(1));
                bw.flush();
                return;
            }
        }

        bw.write(String.valueOf(0));
        bw.flush();
    }
}