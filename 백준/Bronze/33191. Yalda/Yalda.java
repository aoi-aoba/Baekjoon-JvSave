import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int budget = Integer.parseInt(br.readLine());
        int watermelon = Integer.parseInt(br.readLine());
        int pomegranates = Integer.parseInt(br.readLine());
        int nuts = Integer.parseInt(br.readLine());

        if(budget >= watermelon) System.out.println("Watermelon");
        else if(budget >= pomegranates) System.out.println("Pomegranates");
        else if(budget >= nuts) System.out.println("Nuts");
        else System.out.println("Nothing");
        br.close();
    }
}