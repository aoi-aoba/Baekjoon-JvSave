import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> ingredientSet = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) ingredientSet.add(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N-1; i++) ingredientSet.remove(st.nextToken());
        System.out.println(ingredientSet.toArray()[0]);
    }
}