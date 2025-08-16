import java.io.*;
import java.util.*;

public class Main {
    public static HashSet<String> cheeses = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String topping = st.nextToken();
            if (topping.endsWith("Cheese")) cheeses.add(topping);
        }
        System.out.println(cheeses.size() >= 4 ? "yummy" : "sad");
    }
}