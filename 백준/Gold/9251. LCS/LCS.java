import java.io.*;

public class Main {
    public static int findLCSLen(String s1, String s2) {
        int a = s1.length(), b = s2.length();
        int[][] dpTable = new int[a + 1][b + 1];
        for (int i = 0; i < a + 1; i++)
            for (int j = 0; j < b + 1; j++)
                if (i == 0 || j == 0)
                    dpTable[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                else
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
        return dpTable[a][b];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine(), str2 = br.readLine();
        System.out.println(findLCSLen(str1, str2));
    }
}