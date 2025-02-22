import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int numOfQuestions = Integer.parseInt(br.readLine());
            for(int j=0; j<numOfQuestions; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num_1 = Integer.parseInt(st.nextToken());
                int num_2 = Integer.parseInt(st.nextToken());
                System.out.println(num_1 + num_2 + " " + num_1 * num_2);
            }
        }
        br.close();
    }
}