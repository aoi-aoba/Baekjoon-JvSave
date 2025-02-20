import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        if(speed <= limit) System.out.println("Congratulations, you are within the speed limit!");
        else if(speed - limit <= 20) System.out.println("You are speeding and your fine is $100.");
        else if(speed - limit <= 30) System.out.println("You are speeding and your fine is $270.");
        else System.out.println("You are speeding and your fine is $500.");
    }
}