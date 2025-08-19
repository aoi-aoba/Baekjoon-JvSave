import java.io.*;
import java.util.*;

public class Main {
    static int N, K, T = 0;
    static int[] arr = new int[500001], temp = new int[500001];

    // 시작지점이 끝 지점보다 작으면 중간지점을 잡고 앞뒤로 나눠서 mergeSort 한 후 합치기
    public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    // 앞뒤로 나뉜 배열은 이미 정렬된 상태이므로 앞부분과 뒷부분을 하나씩 인덱스를 올리며 합치기
    public static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        // 어느 한 부분의 배열이 모두 끝나게 되면 남은 것을 돌림
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // arr 배열에 다시 정리해주는 과정
        i = left;
        while (i <= right) {
            arr[i] = temp[i++];
            T++;
            // 배열에 저장하는 횟수를 T로 두고 K번째 저장되는 수를 출력한다
            if (T == K) {
                System.out.println(arr[i - 1]);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N - 1);
        System.out.println(-1);
    }
}