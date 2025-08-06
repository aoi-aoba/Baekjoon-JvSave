import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] cards = new long[N];

        for (int i = 0; i < N; i++)
            cards[i] = Long.parseLong(br.readLine());
        Arrays.sort(cards);

        long cardNumMax = cards[0];
        int cardCnt = 1, maxCnt = 0;

        for (int i = 1; i < N; i++) {
            if (cards[i - 1] == cards[i]) cardCnt++;
            else {
                if (maxCnt < cardCnt) {
                    cardNumMax = cards[i - 1];
                    maxCnt = cardCnt;
                }
                cardCnt = 1;
            }
        }
        
        if (maxCnt < cardCnt)
            cardNumMax = cards[N - 1];

        bw.write(String.valueOf(cardNumMax));
        bw.flush();
    }
}