import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            if (temp.contains("PO")) temp = temp.replace("PO", "PHO");
            output.append(temp).append("\n");
        }
        System.out.print(output);
    }
}