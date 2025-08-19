import java.io.*;

public class Main {
    static StringBuilder result = new StringBuilder();
    public static void move(int n, int start, int dest) {
        result.append(start).append(" ").append(dest).append("\n");
    }
    public static void hanoi(int n, int start, int by, int dest) {
        if (n == 1) {
            move(1, start, dest);
            // 원반이 한개면, 시작에서 도착까지 갈 수 있다
        } else {
            hanoi(n - 1, start, dest, by);
            // 이동해야 하는 원반의 그 윗 원반까지, 시작 기둥에서 보조 기둥으로 이동 (start -> by 인 셈이다)
            move(n, start, dest);
            hanoi(n - 1, by, start, dest);
            // 이동해야 하는 원반의 그 윗 원반까지, 보조 기둥에서 도착 기둥으로 이동 (by - > dest 인 셈이다)
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        hanoi(K, 1, 2, 3);
        System.out.println((int)Math.pow(2, K) - 1);
        System.out.println(result);
    }
}