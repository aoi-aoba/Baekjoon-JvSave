import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> roadLenList = new ArrayList<>(), gasLiterCost = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++)
            roadLenList.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            gasLiterCost.add(Integer.parseInt(st.nextToken()));

        long sum = 0, smallest = gasLiterCost.get(0);

        for (int i = 0; i < N - 1; i++) {
            if (gasLiterCost.get(i) < smallest)
                smallest = gasLiterCost.get(i);
            sum += smallest * roadLenList.get(i);
        }

        System.out.println(sum);
    }
}