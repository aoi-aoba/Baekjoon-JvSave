import java.io.*;
import java.util.*;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H, W, N, M = 0;
        int x, y = 0;
        H = Integer.parseInt(st.nextToken()); // 세로 칸수
        W = Integer.parseInt(st.nextToken()); // 가로 칸수
        N = Integer.parseInt(st.nextToken()); // 세로로 비우고 앉아야 하는 칸수
        M = Integer.parseInt(st.nextToken()); // 가로로 비우고 앉아야 하는 칸수
        x = H / (N + 1);
        y = W / (M + 1);
        if (H % (N + 1) != 0) x += 1;
        if (W % (M + 1) != 0) y += 1;
        System.out.println(x * y);
        br.close();
    }
}

/*
    한 사람이 차지하는 공간은 가로 (1+N) * (1+H)칸이므로
    전체 H * W칸 내에 한 사람이 차지하는 공간 사각형을 몇 개 채울 수 있는지의 관점으로 접근한다.
    홀수/짝수의 경우로 환산될 경우 마지막에 나머지가 존재하므로 1을 더 더해준다. 
 */