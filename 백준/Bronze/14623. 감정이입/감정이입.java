import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryNum1 = br.readLine();
        String binaryNum2 = br.readLine();
        long result = Long.parseLong(binaryNum1, 2) * Long.parseLong(binaryNum2, 2);
        System.out.println(Long.toBinaryString(result));
        br.close();
    }
}