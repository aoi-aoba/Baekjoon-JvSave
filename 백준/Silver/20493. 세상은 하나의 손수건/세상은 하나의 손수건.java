import java.util.*;
import java.io.*;

public class Main {
    public static int posX = 0, posY = 0, nowTime = 0, nowType = 0;
    public static void doMove(int time, int spinType) {
        int moveTime = time - nowTime;
        nowTime = time;
        switch (nowType) {
            case 0 :
                posX += moveTime;
                break;
            case 1 :
                posY -= moveTime;
                break;
            case 2 :
                posX -= moveTime;
                break;
            case 3 :
                posY += moveTime;
                break;
        }

        // spinType의 경우 0이면 현 상황 유지, -1이면 left / 1이면 right
        if (spinType == -1) nowType = (nowType != 0) ? nowType - 1 : 3;
        else if (spinType == 1) nowType = (nowType != 3) ? nowType + 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer init = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(init.nextToken()), T = Integer.parseInt(init.nextToken()), moveType = 0;
        // type 0 (x+ y0) / type 1 (x0 y-) / type 2 (x- y0) type 3 (x0 y+) 시계방향

        for (int i = 0; i < N; i++) {
            StringTokenizer moveOp = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(moveOp.nextToken());
            String spinType = moveOp.nextToken();
            doMove(time, (spinType.length() == 4 ? -1 : 1));
        }

        doMove(T, 0);

        bw.write(String.format("%d %d\n", posX, posY));
        bw.flush();
    }
}