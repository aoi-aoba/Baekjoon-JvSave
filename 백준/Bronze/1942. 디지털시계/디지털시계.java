import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String temp = br.readLine();
            if(temp == null) break;

            StringTokenizer st = new StringTokenizer(temp);
            String startTimeStr = st.nextToken();
            String endTimeStr = st.nextToken();
            int[] startTime = new int[3], endTime = new int[3];

            st = new StringTokenizer(startTimeStr, ":");
            for(int i=0; i<3; i++) startTime[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(endTimeStr, ":");
            for(int i=0; i<3; i++) endTime[i] = Integer.parseInt(st.nextToken());

            int cnt = 0;
            while(true) {
                int time = startTime[0] * 10000 + startTime[1] * 100 + startTime[2];
                if(time % 3 == 0) cnt++;
                if(startTime[0] == endTime[0] && startTime[1] == endTime[1] && startTime[2] == endTime[2]) break;
                startTime[2]++;
                if(startTime[2] >= 60) {
                    startTime[2] -= 60;
                    startTime[1]++;
                }
                if(startTime[1] >= 60) {
                    startTime[1] -= 60;
                    startTime[0]++;
                }
                if(startTime[0] >= 24) startTime[0] -= 24;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}