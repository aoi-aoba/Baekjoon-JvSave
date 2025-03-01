import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int K = Integer.parseInt(br.readLine());	// 첫 째 줄 정수 값

         int sum;
         for(int i = 1; i <= K; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());

             int n = Integer.parseInt(st.nextToken());	// 소유한 선박의 수
             int s = Integer.parseInt(st.nextToken());	// 하루 이동할 수 있는 거리
             int d = Integer.parseInt(st.nextToken());	// 기한일

             sum = 0;	// 출력 될 값

             for(int j = 0; j < n; j++) {
                 st = new StringTokenizer(br.readLine());

                 int di = Integer.parseInt(st.nextToken());	// 배네치아까지의 거리
                 int vi = Integer.parseInt(st.nextToken());	// 하루 얻을 수 있는 가치

                 if(s * d >= di) {
                     sum += vi;
                 }
             }

             System.out.printf("Data Set %d:\n", i);
             System.out.printf("%d\n\n", sum);
         }
    }
}