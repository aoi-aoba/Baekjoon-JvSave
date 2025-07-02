import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][4];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
            arr[i][3] = i + 1;
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] != o2[0]) return Integer.compare(o2[0], o1[0]);
            else if (o1[1] != o2[1]) return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[2], o2[2]);
        });
        System.out.println(arr[0][3]);
    }
}