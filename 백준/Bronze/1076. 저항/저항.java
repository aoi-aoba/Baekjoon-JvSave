import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        BigInteger resistor = BigInteger.ZERO;
        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();
        long val1 = 0, val2 = 0, val3 = 0;
        for(int i=0; i< colorArr.length; i++) {
            if(colorArr[i].equals(color1)) val1 = i;
            if(colorArr[i].equals(color2)) val2 = i;
            if(colorArr[i].equals(color3)) val3 = (long)Math.pow(10, i);
        }
        resistor = resistor.add(BigInteger.valueOf(val1*10+val2)).multiply(BigInteger.valueOf(val3));
        System.out.println(resistor);
        br.close();
    }
}