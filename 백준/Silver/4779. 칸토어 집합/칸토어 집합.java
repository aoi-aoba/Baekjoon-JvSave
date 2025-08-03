import java.io.*;

public class Main {
    public static int threePow(int n) {
        if (n == 0) return 1;
        return 3 * threePow(n - 1);
    }
    public static String make(int n) {
        if (n == 0) return "-";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) sb.append(make(n - 1));
        return sb.toString();
    }
    public static String convertToStr(char[] str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str) sb.append(ch);
        return sb.toString();
    }
    public static String cantorSet(int n, char[] str) {
        if (n == 0) return "-";
        if (n == 1) return "- -";

        int m = threePow(n - 1);
        for (int i = 0; i < m; i++) str[m + i] = ' ';
        // 입력 n에 대하여 3^(n-1)부터 2*3^(n-1)-1은 공백처리 필요

        String part = make(n - 1);
        part = cantorSet(n - 1, part.toCharArray());
        // 입력 n에 대하여 0~3^(n-1)-1 부분과 2*3^(n-1)~3^n-1까지는 서로 같은 모양임
        // m = 3^(n-1)로 대체했으므로 이 구간이 0~m-1, 2m~3m-1로 표현할 수 있음

        for (int i = 0; i < m; i++) str[i] = part.charAt(i);
        for (int i = 0; i < m; i++) str[2 * m + i] = part.charAt(i);
        return convertToStr(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str == null) break;

            int N = Integer.parseInt(str);
            String result = make(N);
            
            result = cantorSet(N, result.toCharArray());
            out.append(result).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}