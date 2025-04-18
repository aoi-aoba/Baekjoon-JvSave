import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (!hashMap.containsKey(temp)) hashMap.put(temp, "");
            }
        }
        System.out.println(hashMap.size());
        br.close();
    }
}
