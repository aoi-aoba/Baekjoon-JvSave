import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int moveAtoC = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        double timeLimit = Integer.parseInt(br.readLine()) + 0.5;
        System.out.println((moveAtoC > timeLimit) ? 0 : 1);
        
    }
}