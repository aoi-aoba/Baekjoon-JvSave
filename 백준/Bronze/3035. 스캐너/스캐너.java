import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int zr = Integer.parseInt(st.nextToken()), zc = Integer.parseInt(st.nextToken());
        StringBuilder res = new StringBuilder();

        String[] input = new String[r];
        for(int i = 0; i < r; i++) input[i] = br.readLine();

        for(int i = 0; i < r; i++) {
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < c; j++) {
                line.append(String.valueOf(input[i].charAt(j)).repeat(zc));
            }
            line.append("\n");
            res.append(line.toString().repeat(zr));
        }

        System.out.println(res);
        br.close();
    }
}