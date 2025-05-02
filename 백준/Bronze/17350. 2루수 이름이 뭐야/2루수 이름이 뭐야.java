import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean isAnj = false;
        while (N-- > 0) if (br.readLine().equals("anj")) isAnj = true;
        System.out.println(isAnj ? "뭐야;" : "뭐야?");
        br.close();
    }
}