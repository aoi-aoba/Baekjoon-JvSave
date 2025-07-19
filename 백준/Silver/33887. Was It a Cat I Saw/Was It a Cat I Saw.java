import java.io.*;

public class Main {
    public static boolean isPalindrome(int numInDec) {
        String numStr = Integer.toBinaryString(numInDec);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++)
            if (numStr.charAt(i) != numStr.charAt(len - 1 - i))
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
    public static int findPalUpside(int targetNum, int downSide) {
        int initTargetNum = targetNum;
        if (downSide == -1) {
            while (true) {
                if (isPalindrome(targetNum))
                    return targetNum - initTargetNum;
                else targetNum++;
            }
        } else {
            while (targetNum - initTargetNum < downSide) {
                if (isPalindrome(targetNum))
                    return targetNum - initTargetNum;
                else targetNum++;
            }
            return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int target = Integer.parseInt(br.readLine());
            int down = findPalDownside(target), up = findPalUpside(target, down);
            if (down == -1) out.append(up).append("\n");
            else if (up == -1) out.append(down).append("\n");
            else out.append(Math.min(up, down)).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}