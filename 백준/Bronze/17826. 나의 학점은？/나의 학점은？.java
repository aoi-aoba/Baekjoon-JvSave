import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) list.add(Integer.parseInt(st.nextToken()));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 50; i++) {
            if (n == list.get(i)) {
                if (i < 5) System.out.println("A+");
                else if (i < 15) System.out.println("A0");
                else if (i < 30) System.out.println("B+");
                else if (i < 35) System.out.println("B0");
                else if (i < 45) System.out.println("C+");
                else if (i < 48) System.out.println("C0");
                else System.out.println("F");
                break;
            }
        }
    }
}