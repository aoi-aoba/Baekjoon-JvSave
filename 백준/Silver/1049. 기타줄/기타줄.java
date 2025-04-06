import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken()), brandNum = Integer.parseInt(st.nextToken());
        int lineSetMin = 1001, lineOneMin = 1001, result = 0;
        for (int i = 0; i < brandNum; i++) {
            st = new StringTokenizer(br.readLine());
            lineSetMin = Math.min(lineSetMin, Integer.parseInt(st.nextToken()));
            lineOneMin = Math.min(lineOneMin, Integer.parseInt(st.nextToken()));
        }
        result = lineSetMin * (lineNum / 6) + lineOneMin * (lineNum % 6); // 6개 세트로 최대한 사고 남는 선을 모두 낱개로 구매
        result = Math.min(result, lineSetMin * (lineNum / 6 + 1)); // 6개 세트를 아예 충분히 사버리는 경우
        result = Math.min(result, lineOneMin * lineNum); // 낱개로 전부 사버리는 경우
        System.out.println(result);
    }
}