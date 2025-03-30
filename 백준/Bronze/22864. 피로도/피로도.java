import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tired = Integer.parseInt(st.nextToken()), work = Integer.parseInt(st.nextToken());
        int rest = Integer.parseInt(st.nextToken()), limit = Integer.parseInt(st.nextToken());
        int tiredNow = 0, workDid = 0;
        for (int i = 0; i < 24; i++) {
            if (tiredNow + tired <= limit) {
                tiredNow += tired;
                workDid += work;
            } else if (tiredNow != 0) {
                tiredNow -= rest;
                if (tiredNow < 0) tiredNow = 0;
            }
        }
        System.out.println(workDid);
        br.close();
    }
}