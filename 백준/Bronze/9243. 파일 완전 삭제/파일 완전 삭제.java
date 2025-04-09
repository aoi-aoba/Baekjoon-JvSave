import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int requestedString(String target, String program) {
        boolean isReversedBit = (target.charAt(0) != program.charAt(0));
        for(int i = 1; i < target.length(); i++) {
            if(target.charAt(i) == program.charAt(i) && !isReversedBit) continue;
            else if(target.charAt(i) != program.charAt(i) && isReversedBit) continue;
            else return -1;
        } return isReversedBit ? 1 : 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String removeFile = br.readLine(), programBit = br.readLine();
        int fileType = requestedString(removeFile, programBit);
        if(N % 2 == 0 && fileType == 0) System.out.println("Deletion succeeded");
        else if(N % 2 == 1 && fileType == 1) System.out.println("Deletion succeeded");
        else System.out.println("Deletion failed");
        br.close();
    }
}