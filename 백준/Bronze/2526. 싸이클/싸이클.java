import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int temp = N, size = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(N);

        while (true) {
            temp = (temp * N) % P;
            if (arr.contains(temp)) {
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == temp)
                        size = arr.size() - i;
                }
                break;
            } else arr.add(temp);
        }
        System.out.println(size);
        br.close();
    }
}