import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static String grade(int num) {
        if (num <= 59) return "F";
        else if (num <= 66) return "D";
        else if (num <= 69) return "D+";
        else if (num <= 76) return "C";
        else if (num <= 79) return "C+";
        else if (num <= 86) return "B";
        else if (num <= 89) return "B+";
        else if (num <= 96) return "A";
        else return "A+";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken());
            sb.append(" ").append(grade(Integer.parseInt(st.nextToken()))).append("\n");
        }
        System.out.println(sb);
    }
}