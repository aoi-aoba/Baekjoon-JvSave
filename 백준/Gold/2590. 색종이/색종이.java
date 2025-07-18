import java.io.*;

public class Main {
    static int PAPER_TYPES = 6;
    static int[] papers = new int[PAPER_TYPES];
    public static int countGrids() {
        int result = 0;
        if (papers[5] > 0) { // 6번 색종이는 한 장으로 판이 꽉 찬다
            result += papers[5];
            papers[5] = 0;
        }
        if (papers[4] > 0) {
            result += papers[4]; // 5번 색종이만큼의 그리드를 모두 만들어서 붙이고
            if (papers[0] > 0) {
                if (papers[0] >= papers[4] * 11) papers[0] -= papers[4] * 11;
                // 5번 색종이를 붙인 그리드의 남은 공간에는 1번 색종이가 11장 들어갈 수 있음
                else papers[0] = 0;
                // 그것보다 적다면 그냥 다 붙이고 끝내면 됨
            }
            papers[4] = 0;
        }
        if (papers[3] > 0) {
            result += papers[3]; // 4번 색종이만큼의 그리드를 모두 만들어서 붙이고
            if (papers[1] >= papers[3] * 5) {
                // 4번 색종이만 붙인 그리드 남은 공간에는 2번 색종이가 5장 들어갈 수 있는데, 그것보다 많다면
                papers[1] -= papers[3] * 5; // 붙일 수 있는 만큼 붙이고 끝
            } else { // 남은 공간에 2번 색종이를 다 붙이고도 공간이 남는다면
                int leftSize =  4 * 5 * papers[3] - 4 * papers[1];
                // 남는 공간은 4번 색종이 개수만큼의 그리드당 20 크기, 거기에서 2번 색종이를 모두 붙인 만큼이다
                papers[1] = 0; // 다 붙일 수 있는 것이 자명하고
                papers[0] = papers[0] >= leftSize ? papers[0] - leftSize : 0; // 남은 공간 다 1번으로 붙이기
            }
            papers[3] = 0;
        }
        if (papers[2] > 0) { // 3번 색종이는 자기 자신만으로도 모두 채워질 수 있음에 유의
            result += papers[2] / 4; // 3번 색종이 4개당 한 개의 그리드 채울 수 있음
            papers[2] %= 4;
            if (papers[2] > 0) {
                result++; // 4개가 안 되는 것들은 한 개의 그리드로 처리 가능함
                int use2 = 0;
                // 3번이 3장 채워지면 3*3만 남음. 잘 써봐야 2번은 1장임.
                if (papers[2] == 3) {
                    use2 = Math.min(papers[1], 1);
                    papers[0] = Math.max(0, papers[0] - (9 - 4 * use2));
                } else if (papers[2] == 2) { // 3번이 2장 채워지면 3*6 남고 최대 3장 쓸 수 있음
                    use2 = Math.min(papers[1], 3);
                    papers[0] = Math.max(0, papers[0] - (18 - 4 * use2));
                } else { // 3번이 1장 채워지면 3*3*3 남고 최대 5장 쓸 수 있음
                    use2 = Math.min(papers[1], 5);
                    papers[0] = Math.max(0, papers[0] - (27 - 4 * use2));
                }
                papers[1] -= use2;
            }
            papers[2] = 0;
        }
        if (papers[1] > 0) { // 2번 색종이는 자기 자신만으로도 모두 채워질 수 있음에 유의
            result += papers[1] / 9; // 2번 색종이 9개당 한 개의 그리드 채울 수 있음
            papers[1] %= 9;
            if (papers[1] > 0) { // 2번 색종이가 만약 남았다면
                result++;
                int leftSize = 36 - 4 * papers[1];
                papers[0] = papers[0] >= leftSize ? papers[0] - leftSize : 0;
            }
            papers[1] = 0;
        }
        if (papers[0] > 0) {
            result += papers[0] / 36; // 1번 색종이 36장 당 한 개의 그리드 채울 수 있음
            if (papers[0] % 36 > 0) result++;
            papers[0] = 0;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < PAPER_TYPES; i++) papers[i] = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(countGrids()));
        bw.flush();
    }
}