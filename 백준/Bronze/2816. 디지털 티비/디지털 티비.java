import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int kbs1_idx = 0, kbs2_idx = 0;
        for (int i = 0; i < N; i++) {
            String chn1 = br.readLine();
            if (chn1.equals("KBS1")) kbs1_idx = i;
            if (chn1.equals("KBS2")) kbs2_idx = i;
        }

        if (kbs1_idx > kbs2_idx) kbs2_idx++;
        for (int i = 0; i < kbs1_idx; i++) System.out.print(1);
        for (int i = 0; i < kbs1_idx; i++) System.out.print(4);
        if (kbs2_idx != 1) {
            for (int i = 0; i < kbs2_idx; i++) System.out.print(1);
            for (int i = 1; i < kbs2_idx; i++) System.out.print(4);
        }
        br.close();
    }
}