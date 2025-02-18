import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rickAstleyPromises = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String promise = br.readLine();
            boolean isValid = false;
            for(String validPromise : rickAstleyPromises) {
                if(validPromise.equals(promise)) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}