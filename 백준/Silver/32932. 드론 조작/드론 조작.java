import java.io.*;
import java.util.*;

public class Main {
    private static int obstacles = 0;
    private static int[][] arrObstacle;
    public static boolean isPossibleToMove(int posX, int posY) {
        for(int i=0; i<obstacles; i++) {
            if(posX == arrObstacle[i][0] && posY == arrObstacle[i][1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        obstacles = Integer.parseInt(st.nextToken());
        arrObstacle = new int[obstacles][2];
        int K = Integer.parseInt(st.nextToken());
        int posX = 0, posY = 0;
        String op;

        for(int i = 0; i < obstacles; i++) {
            st = new StringTokenizer(br.readLine());
            arrObstacle[i][0] = Integer.parseInt(st.nextToken()); // PosX
            arrObstacle[i][1] = Integer.parseInt(st.nextToken()); // PosY
        }
        op = br.readLine();

        for(int i = 0; i < op.length(); i++) {
            char now = op.charAt(i);
            if(isPossibleToMove(
                    switch(now) {
                        case 'R' -> posX + 1;
                        case 'L' -> posX - 1;
                        default -> posX;
                    },
                    switch(now) {
                        case 'U' -> posY + 1;
                        case 'D' -> posY - 1;
                        default -> posY;
                    }
            )) {
                switch(now) {
                    case 'R' -> posX++;
                    case 'L' -> posX--;
                    case 'U' -> posY++;
                    case 'D' -> posY--;
                }
            }
        }

        System.out.println(posX + " " + posY);
        br.close();
    }
}

/*
좌표평면 문제니까 posX, posY 써서 일단 기본값 0으로 init하고
장애물은 x좌표랑 y좌표 보관하는 배열 따로 쓰든지 (x,y) 형태로 ArrayList 쓰든지 해서
얘네 돌면서 겹치는 거 있으면 실행 안하게 하고 안겹치면 가는걸로
Str로 이동순서 받아서 하나씩 실행해가면 될듯
 */