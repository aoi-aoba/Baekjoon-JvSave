//  소를 찾아라

import java.util.*;
import java.io.*;

public class Main {
    public static int cnt = 0;
    public static ArrayList<Integer> llist, rlist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        llist = new ArrayList<>();
        rlist = new ArrayList<>();

        char[] input = br.readLine().toCharArray();
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == '(' && input[i+1] == '(') llist.add(i);
            else if (input[i] == ')' && input[i+1] == ')') rlist.add(i);
        }

        int idx = 0;
        for (int temp : rlist) {
            while (idx < llist.size() && llist.get(idx) < temp)
                idx++;
            cnt += idx;
        }

        System.out.println(cnt);
    }
}