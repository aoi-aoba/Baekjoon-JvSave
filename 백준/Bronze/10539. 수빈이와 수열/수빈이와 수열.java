import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), prevSum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            temp *= i;
            list.add(temp - prevSum);
            prevSum = temp;
        }
        for (Integer integer : list) System.out.print(integer + " ");
        br.close();
    }
}