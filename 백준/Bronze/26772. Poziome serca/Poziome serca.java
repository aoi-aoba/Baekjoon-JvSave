import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sb.append(" @@@   @@@  ".repeat(n)).append("\n");
        sb.append("@   @ @   @ ".repeat(n)).append("\n");
        sb.append("@    @    @ ".repeat(n)).append("\n");
        sb.append("@         @ ".repeat(n)).append("\n");
        sb.append(" @       @  ".repeat(n)).append("\n");
        sb.append("  @     @   ".repeat(n)).append("\n");
        sb.append("   @   @    ".repeat(n)).append("\n");
        sb.append("    @ @     ".repeat(n)).append("\n");
        sb.append("     @      ".repeat(n)).append("\n");

        System.out.print(sb);
        br.close();
    }
}