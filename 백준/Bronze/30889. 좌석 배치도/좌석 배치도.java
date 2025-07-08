import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(in.readLine());
         boolean[][] map = new boolean[10][20];
         for (int i = 0; i < T; i++) {
             String str = in.readLine();
             int col = str.charAt(0) - 'A', row = Integer.parseInt(str.replaceAll("[^0-9]", "")) - 1;
             map[col][row] = true;
         }
         StringBuilder out = new StringBuilder();
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 20; j++)
                 out.append(map[i][j] ? "o" : ".");
             out.append("\n");
         }
         System.out.print(out);
     }
}