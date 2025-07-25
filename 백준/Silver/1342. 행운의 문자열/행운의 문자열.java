import java.io.*;

public class Main {
    static int result = 0;
    static String input = "";
    static int[] alphaArr = new int[26];
    public static void tracker(int depth, int prevSelect) {
        if (depth == input.length()) {
            result++;
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (i == prevSelect) continue;
            else if (alphaArr[i] > 0) {
                alphaArr[i]--;
                tracker(depth + 1, i);
                alphaArr[i]++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        for (int i = 0; i < input.length(); i++)
            alphaArr[input.charAt(i) - 'a']++;
        tracker(0, -1);

        bw.write(String.valueOf(result));
        bw.flush();
    }
}