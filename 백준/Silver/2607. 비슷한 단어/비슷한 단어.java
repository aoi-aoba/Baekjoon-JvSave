import java.io.*;

public class Main {
    public static int[] targetArr = new int[26];
    public static void setTargetArr(String target) {
        for (int i = 0; i < target.length(); i++) targetArr[target.charAt(i) - 'A']++;
    }
    public static boolean similarStr(String target, String str) {
        if (str.length() < target.length() - 1 || str.length() > target.length() + 1) return false;
        int[] strArr = new int[26];
        for (int i = 0; i < str.length(); i++) strArr[str.charAt(i) - 'A']++;
        int diffChars = 0, diffVal = 0;
        for (int i = 0; i < 26; i++) {
            if (targetArr[i] != strArr[i]) {
                diffVal += Math.abs(targetArr[i] - strArr[i]);
                diffChars++;
            }
        }
        if (diffChars == diffVal && diffChars < 3) return true;
        // 0으로 같은 경우 : 개수가 다른 영어 알파벳이 없다는 점에서 같은 구성을 가진 단어임
        // 1로 같은 경우 : 개수가 다른 영어 알파벳이 한 개고, 개수 차이도 한 개라면 빼거나 더해서 같은 단어가 됨
        // 2로 같은 경우 : 개수가 다른 영어 알파벳이 두 개고, 개수 차이도 두 개라면 문자 바꾸기로 같아짐
        // CUP과 CAP의 경우 U에서 1 차이, A에서 1 차이
        else return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()), result = 0;
        String target = br.readLine();
        setTargetArr(target);
        for (int t = 1; t < T; t++) if (similarStr(target, br.readLine())) result++;
        bw.write(String.valueOf(result));
        bw.flush();
    }
}