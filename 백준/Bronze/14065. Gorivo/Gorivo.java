import java.io.*;
import java.util.*;

public class Main {
     public static double GALLON_TO_LITER = 3.785411784;
     public static double MILE_TO_KILOMETER = 1.609344;
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double milePerGallon = Double.parseDouble(br.readLine());
        double res = 100 / (milePerGallon * MILE_TO_KILOMETER) * GALLON_TO_LITER;
        System.out.println(res);
    }
}