import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()),
                M = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N+1], changedArr = new int[N+1];
        int cnt = 0;

        for(int i = 1; i < N + 1; i++) {
            arr[i] = i;
            changedArr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(stringTokenizer.nextToken());
            int en = Integer.parseInt(stringTokenizer.nextToken());
            int mi = Integer.parseInt(stringTokenizer.nextToken());
            cnt = st; // 시적점부터 cnt 시작
            for(int j = mi; j <= en; j++) {
                changedArr[cnt] = arr[j];
                cnt++;
            } // 중간지점부터 끝지점까지 배열에 저장
            for(int j = st; j < mi; j++) {
                changedArr[cnt] = arr[j];
                cnt++;
            } // 처음지점부터 중간 전까지 배열에 저장
            System.arraycopy(changedArr, 1, arr, 1, arr.length - 1);
        }

        for(int i = 1; i < changedArr.length; i++) System.out.print(arr[i] + " ");
        br.close();
    }
}