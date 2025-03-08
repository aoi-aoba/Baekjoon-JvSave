import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] b = new int[5001];
        b[0] = b[1] = b[2] = b[4] = -1; // 아예 불가능한 경우
        b[3] = b[5] = 1; // 3과 5는 나를 수 있음

        for(int i=6; i<5001; i++) { // Bottom-up(아래부터 위로/바텀업) Dynamic Programming
            if(b[i-3] != -1 && b[i-5] != -1) b[i] = Math.min(b[i-5], b[i-3]) + 1;
            // i에서 3kg 설탕이나 5kg 설탕을 뺀 결과를 찾았는데 둘 다 가능한 경우, 개수가 더 적은 경우를 가져와 1봉지 추가 값을 저장
            else if(b[i-3] != -1 && b[i-5] == -1) b[i] = b[i-3] + 1;
            // i에서 3kg 설탕 한 개를 뺀 결과만이 이전에 가능했던 경우, 그 경우에서 1봉지를 추가한 값 저장
            else if(b[i-3] == -1 && b[i-5] != -1) b[i] = b[i-5] + 1;
            // i에서 5kg 설탕 한 개를 뺀 결과만이 이전에 가능했던 경우, 그 경우에서 1봉지를 추가한 값 저장
            else b[i] = -1;
            // 아무것도 가능하지 않다면 -1을 저장
        }

        System.out.println(b[N]);
        br.close();
    }
}
