import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int abnormalChickenNum = 2 * M - N;
            System.out.println(abnormalChickenNum + " " + (M - abnormalChickenNum));
            // 다리가 하나씩만 없는거니까, 전체 다리 수에서 현재 센 다리를 빼면 비정상 닭 수 나옴
        }
        br.close();
    }
}