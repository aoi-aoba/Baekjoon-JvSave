import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.readLine();

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sjNum = Integer.parseInt(st.nextToken());
            int sbNum = Integer.parseInt(st.nextToken());
            int sjMax = getMaxNum(sjNum, br);
            int sbMax = getMaxNum(sbNum, br);

            if(sbMax > sjMax) System.out.println("B");
            else if(sbMax < sjMax) System.out.println("S");
            else System.out.println("S");
            br.readLine();
        }
        br.close();
    }

    public static int getMaxNum(int num, BufferedReader br) throws IOException {
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) {
            int next = Integer.parseInt(st.nextToken());
            max = Math.max(next, max);
        }
        return max;
    }
}