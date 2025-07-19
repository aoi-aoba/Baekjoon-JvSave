import java.io.*;

public class Main {
    public static boolean isPalindrome(int numInDec) {
        String numStr = Integer.toBinaryString(numInDec);
        for (int i = 0; i < numStr.length() / 2; i++)
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i))
                return false;
        return true;
    }
    public static int findPalDownside(int targetNum) {
        int initTargetNum = targetNum;
        while (targetNum > 0) {
            if (isPalindrome(targetNum))
                return initTargetNum - targetNum;
            else targetNum--;
        }
        return -1;
    }
    public static int findPalUpside(int targetNum) {
        int initTargetNum = targetNum;
        while (true) {
            if (isPalindrome(targetNum))
                return targetNum - initTargetNum;
            else targetNum++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int target = Integer.parseInt(br.readLine());
            int up = findPalUpside(target), down = findPalDownside(target);
            out.append(down == -1 ? up : Math.min(up, down)).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}