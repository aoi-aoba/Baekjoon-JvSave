import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>(N);
        int sum = 0;
        for(int i=0; i<N; i++) {
            int songTime = Integer.parseInt(br.readLine()); // 노래 시간을 받아서
            list.add(sum + songTime - 1); // 현재 시간 + 누적 시간 - 1로 배열에 추가
            sum += songTime; // 누적 시간에 노래 시간 추가
        }
        for(int i=0; i<Q; i++) {
            int question = Integer.parseInt(br.readLine()); // 물어보는 질문을 받아서
            for(int j=0; j<N; j++) { // 노래 배열 크기만큼 돌면서
                if(question <= list.get(j)) { // 특정 배열 시간보다 작거나 같을 경우 해당하는 것이므로
                    System.out.println(j+1); // 해당 노래의 인덱스에 1을 더해 출력
                    break;
                }
            }
        }
        br.close();
    }
}