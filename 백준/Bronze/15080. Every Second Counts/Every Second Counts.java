import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " :");

        int[] start = new int[3];	// 승객 탑승 시간
        int[] end = new int[3];		// 승객 하차 시간

        for(int i = 0; i < start.length; i++){
            start[i] = Integer.parseInt(st.nextToken());
        }	// 승객 탑승 시간을 배열에 저장

        st = new StringTokenizer(br.readLine(), " :");
        for(int i = 0; i < end.length; i++){
            end[i] = Integer.parseInt(st.nextToken());
        }	// 승객 하차 시간을 배열에 저장

        int startTime = start[2] + start[1] * 60 + start[0] * 3600;	// 승객 탑승 시간을 초 단위로 계산
        int endTime = end[2] + end[1] * 60 + end[0] * 3600;		// 승객 하차 시간을 초 단위로 계산

        // 자정이 넘었을 경우
        if(startTime > endTime) {
            System.out.println(24 * 3600 - startTime + endTime);
            // 자정이 넘지 않았을 경우
        } else {
            System.out.println(endTime - startTime);
        }
    }
}