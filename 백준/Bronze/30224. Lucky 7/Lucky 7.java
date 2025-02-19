import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        boolean containSeven = false, divisible = false;
        if(N.contains("7")) containSeven = true;
        if(Integer.parseInt(N) % 7 == 0) divisible = true;
        if(!containSeven && !divisible) System.out.println(0);
        else if(!containSeven && divisible) System.out.println(1);
        else if(containSeven && !divisible) System.out.println(2);
        else System.out.println(3);
    }
}