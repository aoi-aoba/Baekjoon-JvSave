import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aCard = Integer.parseInt(st.nextToken()), bCard = Integer.parseInt(st.nextToken());
            if (aCard > bCard) a += aCard + bCard;
            else if (aCard < bCard) b += aCard + bCard;
            else {
                a += aCard;
                b += bCard;
            }
        }

        bw.write(String.format("%d %d", a, b));
        bw.flush();
    }
}