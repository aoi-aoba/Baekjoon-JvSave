import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int C = Integer.parseInt(br.readLine());
            int Quarter = C / 25;
            int Dime = C % 25 / 10;
            int Nickel = C % 25 % 10 / 5;
            int Penny = C % 25 % 10 % 5;
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
        br.close();
    }
}