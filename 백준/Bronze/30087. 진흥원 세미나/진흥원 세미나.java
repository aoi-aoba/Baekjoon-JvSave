import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String semi = br.readLine();
            if (semi.equals("Algorithm")) {
                System.out.println("204");
            } else if (semi.equals("DataAnalysis")) {
                System.out.println("207");
            } else if (semi.equals("ArtificialIntelligence")) {
                System.out.println("302");
            } else if (semi.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (semi.equals("Network")) {
                System.out.println("303");
            } else if (semi.equals("Startup")) {
                System.out.println("501");
            } else if (semi.equals("TestStrategy")) {
                System.out.println("105");
            }
        }
    }
}