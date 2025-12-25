//  안테나

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);
        if (list.size() % 2 != 0) System.out.println(list.get(list.size() / 2));
        else System.out.println(list.get(list.size() / 2 - 1));
    }
}