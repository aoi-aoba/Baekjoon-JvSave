import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        boolean[] isRowExist = new boolean[row];
        boolean[] isColExist = new boolean[col];

        Arrays.fill(isColExist, false);
        Arrays.fill(isRowExist, false);

        for(int i=0; i<row; i++) {
            String str = br.readLine();
            if(str.contains("X")) isRowExist[i] = true;
            for(int j=0; j<col; j++) {
                if(str.charAt(j) == 'X') isColExist[j] = true;
            }
        }

        int noSecurityRow = 0, noSecurityCol = 0;
        for(int i=0; i<row; i++)
            if(!isRowExist[i]) noSecurityRow++;
        for(int i=0; i<col; i++)
            if(!isColExist[i]) noSecurityCol++;

        System.out.println(Math.max(noSecurityCol, noSecurityRow));
        br.close();
    }
}