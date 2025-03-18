import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100001]; // 수열을 저장
        boolean[] occur = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(br.readLine());

        int res = 0;
        for (int i = 0; i < N; i++) { // 수열을 돌면서
            if (targetNum - arr[i] > 0 && occur[targetNum - arr[i]]) res++;
            // 찾아야 하는 합에서 수열에 있는 수를 하나 골라서 뺐을 때 자연수인 경우가 첫 조건
            // 찾아야 하는 합에서 수열에 있는 수를 뺀 값이 occur 배열에서 참이면 res 1 추가
            occur[arr[i]] = true;
            // occur 배열에서 거짓이면 true 값 변경, 이 과정에서 중복을 제거할 수 있음
            // 예를 들어, 수열 안에 1과 6이 있어서 targetNum = 7이라 가정하면
            // 이 과정에서 occur 통해 중복 제거 안하면 1을 발견했을 때도, 6을 발견했을 때도 res++
        }

        System.out.println(res);
        br.close();
    }
}