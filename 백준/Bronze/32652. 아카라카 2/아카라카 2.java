import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int k = Integer.parseInt(input.readLine());
        output.append("AKARAKA");
        for (int i = 1; i < k; i++) output.append("RAKA");
        System.out.println(output);
    }
}