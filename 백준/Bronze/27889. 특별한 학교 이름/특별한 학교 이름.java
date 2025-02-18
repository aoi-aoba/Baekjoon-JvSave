import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String headName = br.readLine();
        if(headName.equals("NLCS")) System.out.println("North London Collegiate School");
        else if(headName.equals("BHA")) System.out.println("Branksome Hall Asia");
        else if(headName.equals("KIS")) System.out.println("Korea International School");
        else System.out.println("St. Johnsbury Academy");

    }
}