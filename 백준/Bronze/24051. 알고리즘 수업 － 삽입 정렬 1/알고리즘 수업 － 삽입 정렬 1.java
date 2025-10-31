import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int cnt = 0, answer = -1;
        for (int i = 1; i < N; i++) {
            int loc = i - 1, newItem = A[i];
            while ((0 <= loc && newItem < A[loc])) {
                A[loc + 1] = A[loc];
                loc--;
                cnt++;
                if (cnt == K) answer = A[loc + 1];
            }

            if (loc + 1 != i) {
                A[loc + 1] = newItem;
                cnt++;
                if (cnt == K)
                    answer = A[loc + 1];
            }
        }
        System.out.println(answer);
    }
}