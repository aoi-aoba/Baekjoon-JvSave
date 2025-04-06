import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] stone = new int[2], king = new int[2];
        int N = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        String kingStr = st.nextToken();
        king[0] = kingStr.charAt(0) - 'A';
        king[1] = kingStr.charAt(1) - '1';
        String stoneStr = st.nextToken();
        stone[0] = stoneStr.charAt(0) - 'A';
        stone[1] = stoneStr.charAt(1) - '1';
        N = Integer.parseInt(st.nextToken());

        while (N-- != 0) {
            String op = br.readLine();
            switch(op) {
                case "R" -> {
                    if (king[1] == stone[1] && king[0] + 1 == stone[0] && stone[0] + 1 < 8) { king[0]++; stone[0]++; }
                    else if (!(king[1] == stone[1] && king[0] + 1 == stone[0]) && king[0] + 1 < 8) king[0]++;
                }
                case "L" -> {
                    if (king[1] == stone[1] && king[0] - 1 == stone[0] && stone[0] - 1 > -1) { king[0]--; stone[0]--; }
                    else if (!(king[1] == stone[1] && king[0] - 1 == stone[0]) && king[0] - 1 > -1) king[0]--;
                }
                case "B" -> {
                    if (king[0] == stone[0] && king[1] - 1 == stone[1] && stone[1] - 1 > -1) { king[1]--; stone[1]--; }
                    else if (!(king[0] == stone[0] && king[1] - 1 == stone[1]) && king[1] - 1 > -1) king[1]--;
                }
                case "T" -> {
                    if (king[0] == stone[0] && king[1] + 1 == stone[1] && stone[1] + 1 < 8) { king[1]++; stone[1]++; }
                    else if (!(king[0] == stone[0] && king[1] + 1 == stone[1]) && king[1] + 1 < 8) king[1]++;
                }
                case "RT" -> {
                    if (king[0] + 1 == stone[0] && king[1] + 1 == stone[1] && stone[0] + 1 < 8 && stone[1] + 1 < 8) { king[0]++; king[1]++; stone[0]++; stone[1]++; }
                    else if (!(king[0] + 1 == stone[0] && king[1] + 1 == stone[1]) && king[0] + 1 < 8 && king[1] + 1 < 8) { king[0]++; king[1]++; }
                }
                case "RB" -> {
                    if (king[0] + 1 == stone[0] && king[1] - 1 == stone[1] && stone[0] + 1 < 8 && stone[1] - 1 > -1) { king[0]++; king[1]--; stone[0]++; stone[1]--; }
                    else if (!(king[0] + 1 == stone[0] && king[1] - 1 == stone[1]) && king[0] + 1 < 8 && king[1] - 1 > -1) { king[0]++; king[1]--; }
                }
                case "LT" -> {
                    if (king[0] - 1 == stone[0] && king[1] + 1 == stone[1] && stone[0] - 1 > -1 && stone[1] + 1 < 8) { king[0]--; king[1]++; stone[0]--; stone[1]++; }
                    else if (!(king[0] - 1 == stone[0] && king[1] + 1 == stone[1]) && king[0] - 1 > -1 && king[1] + 1 < 8) { king[0]--; king[1]++; }
                }
                case "LB" -> {
                    if (king[0] - 1 == stone[0] && king[1] - 1 == stone[1] && stone[0] - 1 > -1 && stone[1] - 1 > -1) { king[0]--; king[1]--; stone[0]--; stone[1]--; }
                    else if (!(king[0] - 1 == stone[0] && king[1] - 1 == stone[1]) && king[0] - 1 > -1 && king[1] - 1 > -1) { king[0]--; king[1]--; }
                }
            }
        }

        System.out.println((char)(king[0] + 'A') + "" + (king[1] + 1));
        System.out.println((char)(stone[0] + 'A') + "" + (stone[1] + 1));
        br.close();
    }
}