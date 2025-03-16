import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ableDays = Integer.parseInt(st.nextToken());
            int daysPer = Integer.parseInt(st.nextToken());
            int vacation = Integer.parseInt(st.nextToken());
            caseNum++;
            if(ableDays == daysPer && daysPer == vacation && vacation == 0) break;
            int result = (vacation / daysPer) * ableDays + (Math.min(vacation % daysPer, ableDays));
            System.out.printf("Case %d: %d\n", caseNum, result);
        }
        br.close();
    }
}