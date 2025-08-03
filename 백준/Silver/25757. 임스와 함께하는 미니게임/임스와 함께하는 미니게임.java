import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char gameType = st.nextToken().charAt(0);

        Set<String> gamerSet = new HashSet<>();
        for (int i = 0; i < N; i++) gamerSet.add(br.readLine());

        if (gameType == 'Y') bw.write(String.valueOf(gamerSet.size()));
        else if (gameType == 'F') bw.write(String.valueOf(gamerSet.size() / 2));
        else bw.write(String.valueOf(gamerSet.size() / 3));

        bw.flush();
    }
}