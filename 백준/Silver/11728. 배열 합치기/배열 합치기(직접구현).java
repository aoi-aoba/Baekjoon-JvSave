import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        List<Integer> listA = new ArrayList<>(), listB = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) listA.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) listB.add(Integer.parseInt(st.nextToken()));

        int indexForA = 0, indexForB = 0;
        for (int i = 0; i < N + M; i++) {
            if (indexForB == M || (indexForA < N && listA.get(indexForA) <= listB.get(indexForB))) sb.append(listA.get(indexForA++)).append(" ");
            else if (indexForA == N || (indexForB < M && listB.get(indexForB) <= listA.get(indexForA))) sb.append(listB.get(indexForB++)).append(" ");
        }
        System.out.println(sb);
    }
}
