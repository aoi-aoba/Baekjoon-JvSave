import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] input, lis;
    public static int binarySearch(int top, int val) {
        int start = 0, mid = 0, end = top;
        while (start <= end) { // 이분탐색을 진행하는데
            mid = (start + end) / 2;
            if (lis[mid] == val) return mid; // 도중에 mid가 정확히 그 수 위치 발견하면 반환해서 덮어씌우기
            else if (lis[mid] < val) start = mid + 1;
            else end = mid - 1;
        } // while 문을 빠져나가게 되면 start > end인 상황
        return start; // lower bound를 출력
    }
    public static int lisAlg(int n) { // 최장 증가 부분 수열 알고리즘 (LIS Algorithm)
        lis = new int[n];
        int top = 0; // LIS 수열이 몇 개 저장된 상태인지 저장하는 변수
        for (int num : input) { // 입력값을 돌면서
            if (top == 0 || lis[top - 1] < num) { // 저장된 수가 없거나 가장 마지막 숫자보다 입력이 크다면
                lis[top++] = num; // 맨 마지막에 배치해서 이어가고
                continue;
            }
            lis[binarySearch(top, num)] = num;
            // 그렇지 않으면 이분탐색으로 넘겨받은 인덱스에 저장하기
        }
        return top;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int[N];
        for (int i = 0; i < N; i++) input[i] = Integer.parseInt(st.nextToken());
        System.out.println(lisAlg(N));
    }
}
