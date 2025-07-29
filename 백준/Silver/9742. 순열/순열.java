import java.io.*;
import java.util.*;

public class Main {
    public static int[] factNums;
    public static char[] target;
    public static void setPerNumLimit() {
        factNums = new int[11];
        factNums[0] = 1;
        for (int i = 1; i < 11; i++)
            factNums[i] = factNums[i-1] * i;
    }
    public static String findPermutation(int num) {
        StringBuilder sb = new StringBuilder();
        List<Character> available = new ArrayList<>();
        for (char c : target) available.add(c);

        num--;
        for (int i = target.length; i > 0; i--) {
            int fact = factNums[i - 1], idx = num / fact;
            sb.append(available.get(idx));
            available.remove(idx);
            num %= fact;
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        setPerNumLimit();

        while (true) {
            String input = br.readLine();
            if (input == null) break;
            StringTokenizer st = new StringTokenizer(input);

            target = st.nextToken().toCharArray();
            int findPNum = Integer.parseInt(st.nextToken());

            bw.write(input + " = ");
            if (findPNum > factNums[target.length]) bw.write("No permutation\n");
            else bw.write(findPermutation(findPNum) + "\n");
        }

        bw.flush();
    }
}