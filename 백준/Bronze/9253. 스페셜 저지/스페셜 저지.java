import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine(), s2 = br.readLine(), target = br.readLine();
        boolean cor1 = s1.contains(target), cor2 = s2.contains(target);
        System.out.println(cor1 && cor2 ? "YES" : "NO");
    }
}