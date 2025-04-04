import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), uapc = "UAPC";
        if(str.contains("U")) uapc = uapc.replace("U", "");
        if(str.contains("A")) uapc = uapc.replace("A", "");
        if(str.contains("P")) uapc = uapc.replace("P", "");
        if(str.contains("C")) uapc = uapc.replace("C", "");
        System.out.println(uapc);
        br.close();
    }
}