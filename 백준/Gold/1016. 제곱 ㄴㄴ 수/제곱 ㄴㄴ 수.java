//  제곱 ㄴㄴ 수

import java.util.*;
import java.io.*;

public class Main {
    public static int removed = 0;
    public static boolean[] arr;
    public static long minVal, maxVal;
    public static void sieve() {
        long i = 2, sq = i * i; // 4, 9, 16, ...
        while (sq <= maxVal) { // maxVal보다 작은 제곱수 중에서
            long j = ((minVal + sq - 1) / sq) * sq; // minVal 이상의 최소의 제곱수 배수를 찾고
            while (j <= maxVal) { 
                if (j >= minVal) { 
                    int idx = (int) (j - minVal); // 인덱스는 minVal이 0인 상태
                    if (idx >= arr.length) break;
                    if (arr[idx]) {
                        arr[idx] = false;
                        removed++;
                    }
                }
                j += sq; // sq 값을 늘려가면서 모든 배수 발견
            }
            i++; // 다음 제곱수
            sq = i * i;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        minVal = Long.parseLong(st.nextToken());
        maxVal = Long.parseLong(st.nextToken());

        arr = new boolean[(int)(maxVal - minVal) + 1];
        Arrays.fill(arr, true);
        sieve();
        System.out.println(maxVal - minVal + 1 - removed);
    }
}